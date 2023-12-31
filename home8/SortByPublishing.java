package com.telran.com.home8;

import java.util.Comparator;

public class SortByPublishing implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o1.getPublishing().compareTo(o2.getPublishing());
    }
}
