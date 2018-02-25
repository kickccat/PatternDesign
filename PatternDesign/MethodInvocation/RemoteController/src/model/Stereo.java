package model;

public class Stereo {

    private String roomName;

    public Stereo() {
    }

    public Stereo(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void off() {
        System.out.println(getRoomName() + " Stereo is off");
    }

    public void on() {
        System.out.println(getRoomName() + " Stereo is on");
    }

    public void setCD() {
        System.out.println("Put the CD in");
    }

    public void setVolume(int vol) {
        System.out.println("Set the volume to " + vol);
    }
}
