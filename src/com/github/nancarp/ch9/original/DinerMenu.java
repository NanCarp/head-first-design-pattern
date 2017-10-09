package com.github.nancarp.ch9.original;

import java.util.ArrayList;

public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;
    
    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
        
        addItem("a", "aa", true, 2.99);
        addItem("b", "bb", false, 2.99);
        addItem("c", "cc", true, 3.49);
        addItem("d", "dd", true, 3.59);
    }
    
    public void addItem(String name, String description,boolean vegetarian,double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems = numberOfItems + 1;
        }
    }
    
    /*public MenuItem[] getMenuItems() {
        return menuItems;
    }*/

    public Iterator createIterator() {
        return new DinerMenuIterator(menuItems);
    }
}
