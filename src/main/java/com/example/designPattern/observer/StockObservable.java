package com.example.designPattern.observer;

public interface StockObservable {

    public void add(NotificationAlertObserver obs);

    public void remove(NotificationAlertObserver obs);

    public int getStockCount();

    public void setStockCount(int stock);

    public void notifyAllObservers();
}
