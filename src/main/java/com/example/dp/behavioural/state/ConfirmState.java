package com.example.dp.behavioural.state;

public class ConfirmState implements RideRequestState {


    @Override
    public void handleState() {
        System.out.println("Ride request confirmed");
    }
}
