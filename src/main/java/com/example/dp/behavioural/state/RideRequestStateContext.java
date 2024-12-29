package com.example.dp.behavioural.state;

public class RideRequestStateContext {
    RideRequestState rideRequestState;

    public RideRequestStateContext(RideRequestState rideRequestState){
        this.rideRequestState = rideRequestState;
    }

    public void setRideRequestState(RideRequestState rideRequestState){
        this.rideRequestState = rideRequestState;
    }

    public void performAction(){
        this.rideRequestState.handleState();
    }
}
