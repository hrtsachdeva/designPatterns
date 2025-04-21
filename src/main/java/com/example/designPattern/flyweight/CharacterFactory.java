package com.example.designPattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {

    Map<Character, ICharacter> cache = new HashMap<>();

    public  ICharacter generateCharacter(char ch){
            if(cache.containsKey(ch)){
                return cache.get(ch);
            }else{
                DocumentCharacter documentCharacter = new DocumentCharacter("arial",10,ch);
                cache.put(ch, documentCharacter);
                return documentCharacter;
            }
    }
}
