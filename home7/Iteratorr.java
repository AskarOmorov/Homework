package com.telran.com.home7;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class Iteratorr {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList();
        list.add(7);
        long start =System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {

            list.add(i);
        }
        long end=System.currentTimeMillis();
        System.out.println((start-end));

        long start1 =System.currentTimeMillis();
        for (Integer value : list
        ) {
            Integer temp = value;

        }
        long end1=System.currentTimeMillis();
        System.out.println((start1-end1));


        long start2 =System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.size();

        }
        long end2=System.currentTimeMillis();
        System.out.println((start2-end2));

        long start3 =System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            int temp2 = list.size();

        }
        long end3=System.currentTimeMillis();
        System.out.println((start3-end3));


        long start4 =System.currentTimeMillis();
        for (int i = list.size(); i > 0; i--) {
            int temp3 = list.size();

        }
        long end4=System.currentTimeMillis();
        System.out.println((start4-end4));


        long start5 =System.currentTimeMillis();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            int temp4 = iterator.next();

        }
        long end5=System.currentTimeMillis();
        System.out.println((start5-end5));


        long start6 =System.currentTimeMillis();
        ListIterator<Integer> integerListIterator = list.listIterator();
        while (integerListIterator.hasNext()) {
            int temp5 = integerListIterator.next();

        }
        long end6=System.currentTimeMillis();
        System.out.println((start6-end6));


    }


}
