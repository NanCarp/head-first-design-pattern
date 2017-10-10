package com.github.nancarp.ch10.gumballstatewinner;

public interface State {

	public void insertQuarter();

	public void ejectQuarter();

	public void turnCrank();

	public void dispense();
}
