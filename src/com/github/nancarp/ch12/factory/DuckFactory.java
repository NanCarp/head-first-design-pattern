package com.github.nancarp.ch12.factory;

import com.github.nancarp.ch12.ducks.DuckCall;
import com.github.nancarp.ch12.ducks.MallardDuck;
import com.github.nancarp.ch12.ducks.Quackable;
import com.github.nancarp.ch12.ducks.RedheadDuck;
import com.github.nancarp.ch12.ducks.RubberDuck;

public class DuckFactory extends AbstractDuckFactory {
  
	public Quackable createMallardDuck() {
		return new MallardDuck();
	}
  
	public Quackable createRedheadDuck() {
		return new RedheadDuck();
	}
  
	public Quackable createDuckCall() {
		return new DuckCall();
	}
   
	public Quackable createRubberDuck() {
		return new RubberDuck();
	}
}
