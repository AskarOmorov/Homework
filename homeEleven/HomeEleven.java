package com.telran.com.homeEleven;

import java.util.HashMap;
import java.util.Map;

public class HomeEleven {

    public static void arrayOfString(Map<Character, Integer> a, String b) {
        char[] chars = b.toCharArray();

        for (char c : chars) {
            if (a.containsKey(c)) {
                Integer t = a.get(c) + 1;
                a.put(c, t);
            } else a.put(c, 1);
        }
        System.out.println(a.entrySet());
    }


    public static void main(String[] args) {

        Map<Character, Integer> f = new HashMap<>();

        String g = "gektor";
        arrayOfString(f, g);
    }

}


