package com.example.designPattern.memento;

import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {

    List<ConfigurationMemento> history = new ArrayList<>();

    void addMemento(ConfigurationMemento configurationMemento){
        this.history.add(configurationMemento);
    }

    ConfigurationMemento undo(){
        if(history.isEmpty())
            return null;
        ConfigurationMemento last = history.get(history.size()-1);
        history.remove(last);
        return last;
    }


}
