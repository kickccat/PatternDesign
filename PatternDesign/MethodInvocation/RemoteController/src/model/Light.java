package model;

public class Light {

    private String roomName;

    public Light() {
    }

    public Light(String name) {
        this.roomName = name;
    }

    public String getRoomName() {
        return roomName;
    }

    public void on() {
        System.out.println(getRoomName() + " Light is on");
    }

    public void off() {
        System.out.println(getRoomName() + " Light is off");
    }
}
