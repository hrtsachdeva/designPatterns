package com.example.dp.behavioural.command;

public class TurnOnCommand implements Command{
    Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }


    @Override
    public void execute() {
        device.on();
    }
}
