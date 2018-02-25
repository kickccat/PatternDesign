package controller;

import model.CeilingFan;

public class CeilingFanHighCommand extends CeilingFanOnCommand {

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }
}
