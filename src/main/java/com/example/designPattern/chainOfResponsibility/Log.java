package com.example.designPattern.chainOfResponsibility;

public abstract class Log {

    public final int INFO =1;
    public final int DEBUG =2;
    public final int ERROR =3;

    Log log;

    public Log(Log log){
        this.log = log;
    }
    void log(int logType, String message){
        if(log!= null){
            log.log(logType, message);
        }
    }
}
