package com.github.nancarp.ch5.threadsafe.eager;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    
    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        return uniqueInstance;
    }
}
