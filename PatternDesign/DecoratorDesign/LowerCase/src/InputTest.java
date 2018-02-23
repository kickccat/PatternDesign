import model.LowerCaseInputStream;

import java.io.*;

public class InputTest {

    public static void main(String[] args) {
        int c;
        try {
            InputStream inputStream = new LowerCaseInputStream(new BufferedInputStream(new
                    FileInputStream("/Users/zhouyi/workspace/Program/Github/Java/HeadFirst" +
                    "/PatternDesign/DecoratorDesign/LowerCase/src/test.txt")));
            while ((c = inputStream.read()) >= 0) {
                System.out.print((char)c);
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
