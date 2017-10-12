package com.github.nancarp.ch11.gumball;

public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine) {
        super();
        this.machine = machine;
    }
    
    public void report() {
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current inventory: " + machine.getCount()
                + " gumballs");
        System.out.println("Current state: " + machine.getState());
    }
}
