package com.example.designPattern.command;

public class TurnOffCommand implements Command{

    Receiver receiver;

    public TurnOffCommand(){
        this.receiver = new Receiver();
    }


    @Override
    public void execute() {
        this.receiver.turnOff();
    }
}
