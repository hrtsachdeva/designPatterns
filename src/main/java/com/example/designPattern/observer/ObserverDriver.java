package com.example.designPattern.observer;

public class ObserverDriver {

    public void execute(){
        StockObservable iPhoneObservable = new IPhoneObservable();
        iPhoneObservable.add(new EmailNotificationAlertObserver("hrtsachdeva@gmail.com",iPhoneObservable));
        iPhoneObservable.add(new SmsNotificationAlertObserver("82678591289",iPhoneObservable));
        iPhoneObservable.setStockCount(50);
    }
}
