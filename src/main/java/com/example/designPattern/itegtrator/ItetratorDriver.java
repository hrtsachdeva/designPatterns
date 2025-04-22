package com.example.designPattern.itegtrator;

import java.util.ArrayList;
import java.util.List;

public class ItetratorDriver {

    public void execute(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("Hello",10));
        books.add(new Book("World",20));

        Library library = new Library(books);
        IItetrator iterator = library.createItetrator();
        while(iterator.hasNext()){
           Book book = (Book) iterator.next();
           System.out.println("Book Name: "+ book.getName());

        }
    }
}
