package com.example.designPattern;

import com.example.designPattern.Prototype.PrototypeDriver;
import com.example.designPattern.adapter.AdapterDriver;
import com.example.designPattern.chainOfResponsibility.ChainOfResponsibilityDriver;
import com.example.designPattern.command.CommandDriver;
import com.example.designPattern.composite.CompositeDriver;
import com.example.designPattern.decorator.DecoratorDriver;
import com.example.designPattern.factory.FactoryDriver;
import com.example.designPattern.flyweight.CharacterFactory;
import com.example.designPattern.flyweight.FlyweightDriver;
import com.example.designPattern.itegtrator.ItetratorDriver;
import com.example.designPattern.mediator.MediatorDriver;
import com.example.designPattern.observer.ObserverDriver;
import com.example.designPattern.proxy.ProxyDriver;
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

		System.out.println("------ Decorator Design Pattern ------");
		DecoratorDriver decoratorDriver = new DecoratorDriver();
		decoratorDriver.execute();

		System.out.println("------ Factory Design Pattern ------");
		FactoryDriver factoryDriver = new FactoryDriver();
		factoryDriver.execute();

		System.out.println("------ Chain of Responsibility------");
		ChainOfResponsibilityDriver chainOfResponsibilityDriver = new ChainOfResponsibilityDriver();
		chainOfResponsibilityDriver.execute();

		System.out.println("------ Proxy -----");
		ProxyDriver proxyDriver = new ProxyDriver();
		proxyDriver.execute();

		System.out.println("------ Adapter -----");
		AdapterDriver adapterDriver = new AdapterDriver();
		adapterDriver.execute();

		System.out.println("------ Clone -----");
		PrototypeDriver prototypeDriver = new PrototypeDriver();
		prototypeDriver.execute();

		System.out.println("------ FlyWeight -----");
		FlyweightDriver flyweightDriver = new FlyweightDriver();
		flyweightDriver.execute();

		System.out.println("------ Command -----");
		CommandDriver commandDriver = new CommandDriver();
		commandDriver.execute();

		System.out.println("------ Itetrator -----");
		ItetratorDriver itetratorDriver = new ItetratorDriver();
		itetratorDriver.execute();

		System.out.println("------ Composite -----");
		CompositeDriver compositeDriver = new CompositeDriver();
		compositeDriver.execute();

		System.out.println("------ Mediator -----");
		MediatorDriver mediatorDriver = new MediatorDriver();
		mediatorDriver.execute();
	}

}
