package com.example.designPattern.mediator;

public class Bidder implements Colleague{

    String name;
    AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator){
        this.name = name;
        this.auctionMediator= auctionMediator;
    }
    @Override
    public void placeBid(int amount) {
        this.auctionMediator.placeBid(this, amount);

    }

    @Override
    public void receiveBidNotification(int amount) {
        System.out.println("Bidder: "+name + " received notification of amount "+ amount );

    }

    @Override
    public String getName() {
        return this.name;
    }
}
