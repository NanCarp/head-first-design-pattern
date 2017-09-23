package com.github.nancarp.ch7.iterenum;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by NanCarp on 2017/9/23.
 */
public class EnumerationIterator implements Iterator {
    Enumeration enumeration;

    public EnumerationIterator(Enumeration enumeration) {
        this.enumeration = enumeration;
    }

    public boolean hasNext() {
        return enumeration.hasMoreElements();
    }

    public Object next() {
        return enumeration.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }
}
