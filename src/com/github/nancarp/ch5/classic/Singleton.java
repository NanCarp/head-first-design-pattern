package com.github.nancarp.ch5.classic;

/**
 * @ClassName: Singleton.java
 * @Description: This is not thread safe!
 */
public class Singleton {
    private static Singleton uniqueInstance;
    
    private Singleton() {
        
    }
    
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}
