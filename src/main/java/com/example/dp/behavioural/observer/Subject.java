package com.example.dp.behavioural.observer;

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);

    void updateValue(String str);
}
