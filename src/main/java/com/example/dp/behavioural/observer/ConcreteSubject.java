package com.example.dp.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    private String state;
    private List<Observer> observers= new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void upodateObserver() {
        observers.forEach(Observer::update);
    }

    @Override
    public void updateValue(String state ) {
        this.state= state;
        upodateObserver();
    }
}
