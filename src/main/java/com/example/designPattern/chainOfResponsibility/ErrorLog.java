package com.example.designPattern.chainOfResponsibility;

public class ErrorLog  extends  Log{
    Log nextLogger;
    public ErrorLog(Log log){
        super(log);
    }

    void log(int logType, String message){
        if(logType==ERROR){
            System.out.println("ERROR: "+ message);
        }else {
            super.log(logType, message);
        }
    }
}
