package com.example.designPattern.command;

public class CommandDriver {

    public void execute(){

        Command turnOn = new TurnOnCommand();
        Command turnOff = new TurnOffCommand();

        Invoker invoker = new Invoker();
        invoker.setCommand((turnOn));
        invoker.execute();

        invoker.setCommand(turnOff);
        invoker.execute();
    }
}
