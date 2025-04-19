package com.example.designPattern;

import com.example.designPattern.strategy.StrategyDriverClass;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

	public static void main(String[] args) {

//		SpringApplication.run(DesignPatternApplication.class, args);
		StrategyDriverClass sdc = new StrategyDriverClass();
		sdc.execute();
	}

}
