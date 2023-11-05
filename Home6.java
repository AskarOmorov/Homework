package com.telran.com;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Home6 {

    public static void main(String[] args) {

        List<Integer> a = List.of(5, 234, 8, 5, 87, 4, 23, 87, 23);
        List<Integer> b = new ArrayList<>();

        List<String> c = List.of("vova", "kiril", "chaplin", "vova");
        List<Integer> d = new ArrayList<>();

        for (String n : c) {
            Integer e = n.length();
            d.add(e);
        }

        for (int i = 0; i < a.size(); i++) {
            Integer r = a.get(i) * 2;
            b.add(r);
        }

        for (Integer f : a) {
            if (0 != f % 2) {
                b.add(f);
            }
        }
        Set<String> set = new HashSet<>(c);
        List<String> newC = new ArrayList<>(set);

    }

}












