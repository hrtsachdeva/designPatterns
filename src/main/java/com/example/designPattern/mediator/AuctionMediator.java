package com.example.designPattern.mediator;

public interface AuctionMediator {
    void addBidder(Colleague colleague);
    void placeBid(Colleague colleague, int amount);
}
