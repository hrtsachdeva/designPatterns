package com.example.designPattern.memento;

public class MementoDriver {

    public void execute(){
        ConfigurationCareTaker configurationCareTaker = new ConfigurationCareTaker();
        ConfigurationOriginator configurationOriginator = new ConfigurationOriginator(5,10);

        ConfigurationMemento snapShot1 =  configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapShot1);

        configurationOriginator.setX(10);
        configurationOriginator.setY(20);
        ConfigurationMemento snapShot2 = configurationOriginator.createMemento();
        configurationCareTaker.addMemento(snapShot2);


        //UNDO
        ConfigurationMemento configurationMemento= configurationCareTaker.undo();
        configurationOriginator.setY(configurationMemento.getY());
        configurationOriginator.setX(configurationMemento.getX());

        System.out.println("x: "+configurationOriginator.getX() + "  Y: "+configurationOriginator.getY());
    }
}
