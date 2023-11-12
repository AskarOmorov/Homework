package com.telran.com.home7;

import java.util.Iterator;

public class CustomiIterator implements Iterator {

    private int[] integers;
    private int value;

    public CustomiIterator(int[] integers) {
        this.integers = integers;
    }

    @Override
    public boolean hasNext() {
        if(value<integers.length){
            return true;
    }
        else return false;
    }

    @Override
    public Object next() {
       if(hasNext()){
           int temp =integers[value];
           value++;
           return temp;
       }
       else return false;
    }
}

