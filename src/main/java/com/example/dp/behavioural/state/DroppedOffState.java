package com.example.dp.behavioural.state;

public class DroppedOffState implements RideRequestState {

    @Override
    public void handleState() {
        System.out.println("Dropped off");
    }
}
