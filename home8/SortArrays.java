package com.telran.com.home8;

import java.util.*;

public class SortArrays {

    public static void main(String[] args) {

        String[][] array = {{"abc", "last"}, {"pklz", "yelp"}, {"rpng", "note"}, {"ppza", "xyz"}};

        Arrays.sort(array, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return o1[0].compareTo(o2[0]);
            }
        });
        for (String[] d : array) {
            System.out.println(Arrays.toString(d));
        }
    }
}
