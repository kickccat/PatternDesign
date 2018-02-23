package model;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    public LowerCaseInputStream(InputStream in) {
        super(in);
    }

    public int read() {
        int c = -1;
        try {
            c = super.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return c == -1? c : Character.toLowerCase(c);
    }

    public int read(byte[] bytes, int offset, int len) {
        int result = -1;
        try {
            result = super.read(bytes, offset, len);
            for (int i=offset; i<offset+result; i++) {
                bytes[i] = (byte) Character.toLowerCase(bytes[i]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
