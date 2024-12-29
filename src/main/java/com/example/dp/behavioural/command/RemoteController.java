package com.example.dp.behavioural.command;

public class RemoteController {
    Command command;

    public RemoteController(Command command) {
        this.command = command;
    }


    public void pressButton() {
        command.execute();
    }
}
