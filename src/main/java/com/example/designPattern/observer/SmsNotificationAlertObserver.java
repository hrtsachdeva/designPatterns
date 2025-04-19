package com.example.designPattern.observer;

public class SmsNotificationAlertObserver implements  NotificationAlertObserver{

    StockObservable stockObservable;
    String phone;

    public SmsNotificationAlertObserver(String phone, StockObservable stockObservable){
        this.stockObservable= stockObservable;
        this.phone = phone;
    }
    @Override
    public void update() {
        System.out.println("SMS sent to: "+ phone);
    }
}
