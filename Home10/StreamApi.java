package com.telran.com.Home10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    public static void main(String[] args) {

        List<String> lastNames = new ArrayList(Arrays.asList("Паркер", "Попов", "Николаев", "Курицын"));

        System.out.println(lastNames.stream().filter(p -> p.startsWith("К")).collect(Collectors.toList()));

        lastNames.stream().sorted().collect(Collectors.toList());
        Customer fedya = new Customer(987,
                "fedya",
                32,
                new ArrayList(Arrays.asList(907655,
                        "MOBILE")));

        Customer ivan = new Customer(12345,
                "Ivan",
                35,
                new ArrayList(Arrays.asList(876826,
                        TypeOfPhone.MOBILE, 68655, TypeOfPhone.STATIONARY)));

        Customer dima = new Customer(78676,
                "dimon",
                56,
                new ArrayList(Arrays.asList(8968769,
                        TypeOfPhone.STATIONARY)));
        List<List<Customer>> customerList = new ArrayList(Arrays.asList(ivan, dima, fedya));
        // тут сложновато

        List<Auto> autoList = Arrays.asList(new Auto(8687, "черный", "ауди", 12, 36568),
                new Auto(876, "красный", "опель", 0, 43653),
                new Auto(987, "белый", "ферари", 187, 678),
                new Auto(873, "зеленый", UniqueBrand.ARO, 456, 25000),
                new Auto(873, "зеленый", UniqueBrand.ARO, 456, 25000),
                new Auto(873, "зеленый", UniqueBrand.ARO, 456, 25000),
                new Auto(873, "черный", UniqueBrand.ARO, 0, 25000),
                new Auto(873, "зеленый", UniqueBrand.PROTON, 456, 25000),
                new Auto(873, "зеленый", UniqueBrand.ARO, 456, 25000),
                new Auto(873, "зеленый", UniqueBrand.ARO, 456, 35000));
        List a = autoList.stream().filter(h -> h.getColor().equals("черный") && h.getMileage() == 0).collect(Collectors.toList());
        System.out.println(a);
        autoList.stream()
                .filter(r -> r.getPrice() > 30000 && r.getPrice() < 50000 && r.getUniqueBrand() != null)
                .forEach(f -> System.out.println(f));


    }
}


