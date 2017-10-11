package com.github.nancarp.ch12.adapter;

import com.github.nancarp.ch12.ducks.Quackable;

public class GooseAdapter implements Quackable {
    Goose goose;
    
    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        goose.honk();
    }

}
