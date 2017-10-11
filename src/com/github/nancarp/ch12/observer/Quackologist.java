package com.github.nancarp.ch12.observer;

public class Quackologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: " + duck + " just quacked.");
    }

}
