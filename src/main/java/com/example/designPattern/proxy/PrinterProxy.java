package com.example.designPattern.proxy;

public class PrinterProxy {

    Printer printer;

    public PrinterProxy(){
        this.printer = new Printer();
    }
   public  void printMessage(String message){
        printer.print(message);
   }
}
