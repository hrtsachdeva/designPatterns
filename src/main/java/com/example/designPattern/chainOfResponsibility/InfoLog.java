package com.example.designPattern.chainOfResponsibility;

public class InfoLog extends Log{

    Log nextLogger;
    public InfoLog(Log log){
        super(log);
    }

    void log(int logType, String message){
        if(logType==INFO){
            System.out.println("INFO: "+ message);
        }else {
            super.log(logType, message);
        }
    }
}
