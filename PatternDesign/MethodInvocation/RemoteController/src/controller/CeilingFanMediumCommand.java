package controller;

import model.CeilingFan;

public class CeilingFanMediumCommand extends CeilingFanOnCommand {

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }
}
