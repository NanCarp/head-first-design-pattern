package com.github.nancarp.ch12.decorator;

import com.github.nancarp.ch12.ducks.Quackable;

public class QuackCounter implements Quackable {
    Quackable duck;
    static int numberOfQuacks;
    
    

    public QuackCounter(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

    public static int getQuacks() {
        return numberOfQuacks;
    }
}
