package com.github.nancarp.ch12.ducks;

public class RubberDuck implements Quackable {
	public void quack() {
		System.out.println("Squeak");
	}

	public String toString() {
		return "Rubber Duck";
	}
}
