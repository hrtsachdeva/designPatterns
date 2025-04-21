package com.example.designPattern.flyweight;

public class FlyweightDriver {

    public void execute(){
        CharacterFactory characterFactory = new CharacterFactory();
        ICharacter aChar = characterFactory.generateCharacter('a');
        aChar.display(1,1);
        ICharacter bChar = characterFactory.generateCharacter('b');
        bChar.display(1,2);

    }
}
