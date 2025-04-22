package com.example.designPattern.visitor;

public class VisitorDriver {

    public void execute(){
        RoomElement singleRoom = new SingleRoom();
        RoomElement doubleRoom = new DoubleRoom();

       RoomPriceVisitor priceVisitor = new RoomPriceVisitor();
       singleRoom.accept(priceVisitor);
       singleRoom.getPrice();
       doubleRoom.accept(priceVisitor);
       doubleRoom.getPrice();

    }
}
