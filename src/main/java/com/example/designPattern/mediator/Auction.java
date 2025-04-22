package com.example.designPattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class Auction implements AuctionMediator{

    List<Colleague> bidders;

    public Auction(){
        this.bidders = new ArrayList<>();
    }
    @Override
    public void addBidder(Colleague colleague) {
        this.bidders.add(colleague);
    }

    @Override
    public void placeBid(Colleague colleague, int amount) {
        for(Colleague bidder: bidders){
            if(!bidder.getName().equals(colleague.getName())){
                bidder.receiveBidNotification(amount);
            }
        }
    }
}
