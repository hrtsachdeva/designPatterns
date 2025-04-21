package com.example.designPattern.proxy;

public class ProxyDriver {

  public void execute(){
    PrinterProxy proxy = new PrinterProxy();
    proxy.printMessage("Hello World");
  }
}
