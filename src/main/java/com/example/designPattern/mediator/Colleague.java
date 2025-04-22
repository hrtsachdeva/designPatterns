package com.example.designPattern.mediator;

public interface Colleague {
    void placeBid(int amount);
    void receiveBidNotification(int amount);
    String getName();

}
