package com.example.designPattern.flyweight;

import java.awt.*;

public class DocumentCharacter implements ICharacter{

    private String font;
    private int height;
    private char character;

    public DocumentCharacter(String font,int height, char ch){
        this.font = font;
        this.height = height;
        this.character = ch;
    }
    @Override
    public void display(int i, int j) {
        System.out.println("Printing Character : "+ this.character+" at i = "+i+" j="+j);
    }
}
