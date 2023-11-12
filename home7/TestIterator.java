package com.telran.com.home7;

public class TestIterator {

    public static void main(String[] args) {

        int test[]={4,4,5,6,3,8};
        CustomiIterator iter =new CustomiIterator(test);

        for (int r :test) {
            if(iter.hasNext()){
                System.out.println(iter.next());
            }

        }

    }
}
