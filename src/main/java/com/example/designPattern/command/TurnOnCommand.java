package com.example.designPattern.command;

public class TurnOnCommand implements Command{
    Receiver receiver;
    public TurnOnCommand(){
        receiver= new Receiver();
    }
    @Override
    public void execute() {
        receiver.turnOn();
    }
}
