package com.practise.patterns.commandpattern;

/**
 * Created by trinath on 12/06/17.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];
        Command noCommand = new NoCommand();
        for(int i = 0 ; i < 7; i++){
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void onButtonPushed(int slot) {
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }

    public void offButtonPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonPushed(){
        undoCommand.undo();
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public String toString() {
        StringBuffer stringBuff = new StringBuffer();
        stringBuff.append("Remote Control \n");
        for( int i = 0; i < onCommands.length; i++) {
            stringBuff.append("slot[" + i + "] " + onCommands[i].getClass().getName() + "  " + offCommands[i].getClass().getName());
        }
        return stringBuff.toString();
    }
}

