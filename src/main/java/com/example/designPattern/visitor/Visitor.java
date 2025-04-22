package com.example.designPattern.visitor;

public interface Visitor {

    public void visit(SingleRoom singleRoom);
    public void visit(DoubleRoom doubleRoom);
}
