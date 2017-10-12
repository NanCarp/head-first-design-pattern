package com.github.nancarp.ch11.gumball;

public interface State {

	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
}
