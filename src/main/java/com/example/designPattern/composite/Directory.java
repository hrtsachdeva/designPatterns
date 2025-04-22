package com.example.designPattern.composite;

import java.util.List;

public class Directory implements  FileSystem{

    List<FileSystem> elements ;
    String name;

    public Directory(String name, List<FileSystem> files){
        this.name = name;
        this.elements = files;
    }

    @Override
    public void ls() {
        System.out.println("Directory name: "+ name);
        for(FileSystem ele: elements){
            ele.ls();
        }
    }
}
