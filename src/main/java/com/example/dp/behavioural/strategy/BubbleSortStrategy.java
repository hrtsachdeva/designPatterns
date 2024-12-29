package com.example.dp.behavioural.strategy;

public class BubbleSortStrategy implements Strategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Bubble Sort");
    }
}
