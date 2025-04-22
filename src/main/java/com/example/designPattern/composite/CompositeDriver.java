package com.example.designPattern.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeDriver {
    public void execute(){
        List<FileSystem> movies = new ArrayList<>();
        movies.add(new File("ZNMD"));
        movies.add(new File("KHNH"));
        Directory directory = new Directory("Movies",movies);
        directory.ls();

    }
}
