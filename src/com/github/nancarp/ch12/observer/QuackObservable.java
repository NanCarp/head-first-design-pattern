package com.github.nancarp.ch12.observer;

public interface QuackObservable {
    public void registerObserver(Observer observer);
    public void notifyObservers();
}
