package com.example.designPattern.itegtrator;

import java.util.List;

public class BookItegtrator implements IItetrator{

    private List<Book> books;
    private int index =0;

    public BookItegtrator(List<Book> books){
        this.books= books;
    }
    @Override
    public boolean hasNext() {
        return !(books.size() == index);
    }

    @Override
    public Object next() {
        if(hasNext()){
            return books.get(index++);
        }
        return null;
    }
}
