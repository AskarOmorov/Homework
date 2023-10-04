package com.telran.com.homeworkjavapro;

import java.util.concurrent.atomic.AtomicStampedReference;

public class Home1 {
    public static void main(String[] args) {
        Person Oskar = new Person();
        Person Kubo = new Person("Kubo", "Taitokubo",67);
        Oskar.setName("Oskar");
        Oskar.setFullName("Попов");
        Oskar.setAge(34);
        System.out.println(Oskar);
        System.out.println(Kubo);
        Oskar.talk();
        Oskar.movie();
        Kubo.movie();
        Kubo.talk();
    }
}
