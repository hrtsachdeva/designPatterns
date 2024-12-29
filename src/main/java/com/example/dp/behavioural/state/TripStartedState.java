package com.example.dp.behavioural.state;

public class TripStartedState implements RideRequestState {


    @Override
    public void handleState() {
        System.out.println("Trip started");
    }
}
