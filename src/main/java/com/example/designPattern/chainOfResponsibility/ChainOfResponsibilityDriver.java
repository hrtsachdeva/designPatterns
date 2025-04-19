package com.example.designPattern.chainOfResponsibility;

public class ChainOfResponsibilityDriver {

    public void execute(){
        Log logger = new InfoLog(new DebugLog(new ErrorLog(null)));
        logger.log(2, "this is the message");
    }
}
