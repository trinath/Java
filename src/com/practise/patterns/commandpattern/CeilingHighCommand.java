package com.practise.patterns.commandpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class CeilingHighCommand implements Command {
    CeilingFan ceilingFan;
    int prevSpeed;

    public CeilingHighCommand(CeilingFan ceilingFan){
        this.ceilingFan = ceilingFan;
    }

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
    }

    public void undo() {
        if( prevSpeed == CeilingFan.HIGH) {
            ceilingFan.high();
        } else if ( prevSpeed == CeilingFan.MEDIUM) {
            ceilingFan.medium();
        } else if ( prevSpeed == CeilingFan.LOW) {
            ceilingFan.low();
        } else {
            ceilingFan.off();
        }
    }
}
