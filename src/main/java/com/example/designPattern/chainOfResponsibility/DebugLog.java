package com.example.designPattern.chainOfResponsibility;

public class DebugLog extends Log{
    Log nextLogger;
    public DebugLog(Log log){
        super(log);
    }

    void log(int logType, String message){
        if(logType==DEBUG){
            System.out.println("DEBUG: "+ message);
        }else {
            super.log(logType, message);
        }
    }
}
