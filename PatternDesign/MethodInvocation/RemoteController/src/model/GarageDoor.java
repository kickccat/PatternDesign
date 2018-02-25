package model;

public class GarageDoor {

    String name;

    public GarageDoor() {
    }

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("Garage door is open");
    }

    public void down() {
        System.out.println("Garage door is closed");
    }

    public void stop() {
        System.out.println("Garage door is stop");
    }

    public void lightOn() {
        System.out.println("Garage door is light on");
    }

    public void lightOff() {
        System.out.println("Garage door is light off");
    }
}
