package com.example.dp.behavioural.strategy;

public class SelectionSortStrategy implements Strategy{
    @Override
    public void sort(int[] arr) {
        System.out.println("Sorting using Selection Sort");
    }
}
