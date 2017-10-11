package com.github.nancarp.ch12.composite;

import java.util.ArrayList;
import java.util.Iterator;

import com.github.nancarp.ch12.ducks.Quackable;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        while (iterator.hasNext()) {
            Quackable quacker = iterator.next();
            quacker.quack();
        }
    }
}
