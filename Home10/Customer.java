package com.telran.com.Home10;

import java.util.List;

public class Customer {

    private int id;
    private String name;
    private int age;
    private List<Phones> phoneNumbers;

    public Customer(int id, String name, int age, List<Phones> phoneNumbers) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Phones> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<Phones> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
