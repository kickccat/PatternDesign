package controller;

import model.CeilingFan;

public class CeilingFanOnCommand implements Command {

    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingFanOnCommand() {
    }

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.on();
    }

    @Override
    public void undo() {
        if (prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        }
        else if (prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        }
        else if (prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        }
        else if (prevSpeed == CeilingFan.OFF) {
            ceilingFan.off();
        }
    }
}
