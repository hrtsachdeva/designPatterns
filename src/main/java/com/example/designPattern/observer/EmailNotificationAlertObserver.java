package com.example.designPattern.observer;

public class EmailNotificationAlertObserver implements NotificationAlertObserver{
    StockObservable stockObservable;
    String email;

    public EmailNotificationAlertObserver(String email, StockObservable stockObservable){
        this.stockObservable= stockObservable;
        this.email = email;
    }
    @Override
    public void update() {
        System.out.println("Email sent to :"+email);
    }
}
