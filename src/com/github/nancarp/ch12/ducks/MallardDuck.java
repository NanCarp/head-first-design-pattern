package com.github.nancarp.ch12.ducks;

public class MallardDuck implements Quackable {
	public void quack() {
		System.out.println("Quack");
	}
	
	public String toString() {
		return "Mallard Duck";
	}
}
