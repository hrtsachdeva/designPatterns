package com.example.designPattern.itegtrator;

import java.util.List;

public class Library implements  Aggregrator{
    List<Book> books;

    public Library(List<Book> books){
        this.books = books;
    }
    @Override
    public IItetrator createItetrator() {
        return new BookItegtrator(books);
    }
}
