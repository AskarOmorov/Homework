package com.telran.com.home8;

import java.util.Comparator;

public class SortByYearOfPublishing implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        if( o1.getYerOfPublishing() ==o2.getYerOfPublishing()){
            return 0;
        }
        if(o1.getYerOfPublishing()<o2.getYerOfPublishing()){
            return -1;
        }
        return 1;
    }}

