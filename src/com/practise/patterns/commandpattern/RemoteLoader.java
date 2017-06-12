package com.practise.patterns.commandpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class RemoteLoader {
    public static void main(String args[]) {
        RemoteControl remoteControl = new RemoteControl();
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");

        Command livingRoomLightOn = new LightOnCommand(livingRoomLight);
        Command livingRoomLightOff = new LightOffCommand(livingRoomLight);

        Command kitchenLightOn = new LightOnCommand(kitchenLight);
        Command kitchenLightOff = new LightOffCommand(kitchenLight);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);

        System.out.println(remoteControl);

        remoteControl.onButtonPushed(0);
        remoteControl.offButtonPushed(0);

        remoteControl.onButtonPushed(1);
        remoteControl.offButtonPushed(1);

        remoteControl.undoButtonPushed();
    }
}
