package com.example.designPattern.observer;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservable implements  StockObservable{

    List<NotificationAlertObserver> observers = new ArrayList<>();
    int stockCount =10;
    @Override
    public void add(NotificationAlertObserver obs) {
        observers.add(obs);

    }

    @Override
    public void remove(NotificationAlertObserver obs) {
        observers.remove(obs);
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public void setStockCount(int stock) {
        stockCount += stock;
        if(stockCount>20){
            notifyAllObservers();
        }
    }

    @Override
    public void notifyAllObservers() {
        for(NotificationAlertObserver obs: observers){
            obs.update();
        }
    }
}
