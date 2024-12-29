package com.example.dp;

import com.example.dp.behavioural.command.Command;
import com.example.dp.behavioural.command.RemoteController;
import com.example.dp.behavioural.command.TurnOnCommand;
import com.example.dp.behavioural.command.Tv;
import com.example.dp.behavioural.observer.*;
import com.example.dp.behavioural.state.ConfirmState;
import com.example.dp.behavioural.state.RideRequestState;
import com.example.dp.behavioural.state.RideRequestStateContext;
import com.example.dp.behavioural.state.TripStartedState;
import com.example.dp.behavioural.strategy.BubbleSortStrategy;
import com.example.dp.behavioural.strategy.SelectionSortStrategy;
import com.example.dp.behavioural.strategy.Strategy;
import com.example.dp.behavioural.strategy.StrategyContext;
import com.example.dp.structural.adapter.LegacyPrinter;
import com.example.dp.structural.adapter.NewPrinter;
import com.example.dp.structural.adapter.PrinterAdapter;
import com.example.dp.structural.decorator.BlackCoffee;
import com.example.dp.structural.decorator.Coffee;
import com.example.dp.structural.decorator.MilkCoffee;
import com.example.dp.structural.proxy.Image;
import com.example.dp.structural.proxy.ProxyImage;
import com.example.dp.structural.template.BeverageMaker;
import com.example.dp.structural.template.CoffeeBeverage;


public class DpApplication {

	public static void main(String[] args) {
//
//		// Singleton Design Pattern
//			System.out.println("\n\n*****          Singleton Design Pattern         ******");
//			LazySingleton.getInstance().doSomething();
//			EarlySingleton.getInstance().doSomething();
//			CostlyThreadSafeSingleton.getInstance().doSomething();
//			BestSingletonThreadSafe.getInstance().doSomething();
//
//
//		//Factory Pattern
//			System.out.println("\n\n*****          Factory Design Pattern         ******");
//			VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
//			Client twoWheelerClient = new Client(twoWheelerFactory);
//			Vehicle twoWheeler = twoWheelerClient.getVehicle();
//			twoWheeler.printVehicle();
//
//		//Prototype Pattern
//			System.out.println("\n\n*****          Prototype Design Pattern         ******");
//			Shape redCircle = new CircleShape("red");
//			Shape greenCircle = new CircleShape("green");
//			ShapeClient redShapeClient = new ShapeClient(redCircle);
//			Shape clonedRedShape = redShapeClient.cloneShape();
//			clonedRedShape.draw();
//			ShapeClient greenShapeClient = new ShapeClient(greenCircle);
//			greenShapeClient.cloneShape().draw();
//
//		//Builder Pattern
//		System.out.println("\n\n*****          Builder Design Pattern         ******");
//		Pizza pizza = new PizzaBuilder().setSize(12).setOregano(false).setThinCrust(true).build();
//		System.out.println(pizza.toString());



////		Structural Design Pattern
//        //Adapter pattern
//
//		NewPrinter printer = new PrinterAdapter(new LegacyPrinter());
//		printer.print("Hello World");
//
//		//Decorator pattern
//		Coffee blackCoffee = new BlackCoffee();
//		blackCoffee.description();
//
//		Coffee milkCoffee = new MilkCoffee(new BlackCoffee());
//		milkCoffee.description();
//
//		//Proxy pattern
//		Image img = new ProxyImage("test_10mb.jpg");
//		img.dispaly();
//		img.dispaly();
//
//
//		//Template Pattern
//		BeverageMaker baveragemaker = new CoffeeBeverage();
//		baveragemaker.makeBeverage();

	// Behavioural

		//observer
		Subject sub1 =new  ConcreteSubject();
		Observer obs1 = new Observer1();
		Observer obs2 = new Observer2();
		sub1.addObserver(obs1);
		sub1.addObserver(obs2);
		sub1.updateValue("Hello");

		//Command
		Command tvTurnOnCommand = new TurnOnCommand(new Tv());
		RemoteController remoteController = new RemoteController(tvTurnOnCommand);
		remoteController.pressButton();

		//strategy
		Strategy bubbleSortStrategy = new BubbleSortStrategy();
		StrategyContext strategyContext = new StrategyContext(bubbleSortStrategy);
		strategyContext.sort(new int[]{1,2,3,4,5});

		Strategy selectionSortStrategy = new SelectionSortStrategy();
		strategyContext.setStrategy(selectionSortStrategy);
		strategyContext.sort(new int[]{1,2,3,4,5});

		// State Pattern
		RideRequestState confirmRideRequestState = new ConfirmState();
		RideRequestState tripStartedRequestState = new TripStartedState();
		RideRequestStateContext stateContext = new RideRequestStateContext(confirmRideRequestState);
		stateContext.performAction();

		stateContext.setRideRequestState(tripStartedRequestState);
		stateContext.performAction();



	}

}
