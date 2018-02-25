package model;

public class CeilingFan {

    private String roomName;
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;
    private int speed;

    public CeilingFan() {
    }

    public CeilingFan(String name) {
        this.roomName = name;
        this.speed = OFF;
    }

    public String getRoomName() {
        return roomName;
    }

    public int getSpeed() {
        return speed;
    }

    public void high() {
        speed = HIGH;
    }

    public void medium() {
        speed = MEDIUM;
    }

    public void low() {
        speed = LOW;
    }

    public void on() {
        System.out.println(getRoomName() + " Ceiling Fan is on");
    }

    public void off() {
        speed = OFF;
        System.out.println(getRoomName() + " Ceiling Fan is off");
    }
}
