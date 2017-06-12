package com.practise.patterns.commandpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class LightOnCommand implements Command{
    Light light;

    public LightOnCommand(Light light){
        this.light = light;
    }

    public void execute(){
        light.on();
    }

    public void undo() { light.off(); }
}
