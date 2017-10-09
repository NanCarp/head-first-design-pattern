package com.github.nancarp.ch9.original;

import java.util.ArrayList;

public class PancakeHouseMenu {
    ArrayList menuItems;
    
    public PancakeHouseMenu() {
        menuItems = new ArrayList();
        
        addItem("a", "aa", true, 2.99);
        addItem("b", "bb", false, 2.99);
        addItem("c", "cc", true, 3.49);
        addItem("d", "dd", true, 3.59);
    }
    
    public void addItem(String name, String description,boolean vegetarian,double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }
    
    public Iterator createIterator() {
        return new PancakeHouseMenuIterator(menuItems);
    }
}