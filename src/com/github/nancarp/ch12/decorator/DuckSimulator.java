package com.github.nancarp.ch12.decorator;

import com.github.nancarp.ch12.adapter.Goose;
import com.github.nancarp.ch12.adapter.GooseAdapter;
import com.github.nancarp.ch12.ducks.DuckCall;
import com.github.nancarp.ch12.ducks.MallardDuck;
import com.github.nancarp.ch12.ducks.Quackable;
import com.github.nancarp.ch12.ducks.RedheadDuck;
import com.github.nancarp.ch12.ducks.RubberDuck;

public class DuckSimulator {
	public static void main(String[] args) {
		DuckSimulator simulator = new DuckSimulator();
		simulator.simulate();
	}

	void simulate() {
		Quackable mallardDuck = new QuackCounter(new MallardDuck());
		Quackable redheadDuck = new QuackCounter(new RedheadDuck());
		Quackable duckCall = new QuackCounter(new DuckCall());
		Quackable rubberDuck = new QuackCounter(new RubberDuck());
		Quackable gooseDuck = new GooseAdapter(new Goose());

		System.out.println("\nDuck Simulator: With Decorator");

		simulate(mallardDuck);
		simulate(redheadDuck);
		simulate(duckCall);
		simulate(rubberDuck);
		simulate(gooseDuck);

		System.out.println("The ducks quacked " + 
		                   QuackCounter.getQuacks() + " times");
	}

	void simulate(Quackable duck) {
		duck.quack();
	}
}
