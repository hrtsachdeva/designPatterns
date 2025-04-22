package com.example.designPattern.mediator;

public class MediatorDriver {

    public void execute()
    {
       Auction auction = new Auction();
       Bidder bidder1 = new Bidder("Harshit", auction);
       Bidder bidder2 =new Bidder("Pulkit", auction);
       auction.addBidder(bidder1);
       auction.addBidder(bidder2);

       auction.placeBid(bidder1, 100);

    }
}
