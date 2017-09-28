package com.github.nancarp.ch8.sortduck;

public class Duck implements Comparable {
    String name;
    int weight;
    
    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Object o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
