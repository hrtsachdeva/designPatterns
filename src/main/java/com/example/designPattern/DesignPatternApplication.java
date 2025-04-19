package com.example.designPattern;

import com.example.designPattern.observer.ObserverDriver;
import com.example.designPattern.strategy.StrategyDriverClass;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DesignPatternApplication.class, args);

		System.out.println("------ Strategy Design Pattern ------");
		StrategyDriverClass sdc = new StrategyDriverClass();
		sdc.execute();

		System.out.println("------ Observer Design Pattern ------");
		ObserverDriver obsD = new ObserverDriver();
		obsD.execute();
	}

}
