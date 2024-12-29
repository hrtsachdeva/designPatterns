package com.example.dp.behavioural.strategy;

public class StrategyContext {

    Strategy strategy;

    public  StrategyContext(Strategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void sort(int []arr) {
        strategy.sort(arr);
    }
}
