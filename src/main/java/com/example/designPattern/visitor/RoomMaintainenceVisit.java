package com.example.designPattern.visitor;

public class RoomMaintainenceVisit implements Visitor{
    @Override
    public void visit(SingleRoom singleRoom) {
        System.out.println("Single room maintainence");
    }

    @Override
    public void visit(DoubleRoom doubleRoom) {
        System.out.println("Double room maintainence");
    }
}
