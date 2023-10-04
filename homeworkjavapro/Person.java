package com.telran.com.homeworkjavapro;

public class Person {
   private String name;
   private String fullName;
   private int age;

    public Person() {

    }

    public Person(String name, String fullName,int age){
        this.name = name;
        this.fullName = fullName;
        this.age = age;
    }

    public void setName(String name ){this.name =name;}
    public String getName(){
        return name;}

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void movie() {

        System.out.println("Бежит");
    }
    public void talk(){
        System.out.println("Говорит");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                '}';
    }
}

