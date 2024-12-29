package com.example.dp.behavioural.command;

public class TurnOffCommand implements Command{

    Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }
    @Override
    public void execute() {
        this.device.off();
    }
}
