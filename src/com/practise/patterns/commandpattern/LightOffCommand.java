package com.practise.patterns.commandpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class LightOffCommand implements Command {
    Light light;
    LightOffCommand(Light light) {
        this.light = light;
    }
    public void execute() {
        light.off();
    }
    public void undo() { light.on(); }

}
