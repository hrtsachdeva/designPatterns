package com.example.dp.behavioural.command;

public class Tv implements Device{
    @Override
    public void on() {
        System.out.println("TV is on");
    }

    @Override
    public void off() {
        System.out.println("TV is off");
    }
}
