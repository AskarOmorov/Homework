package com.telran.com.homeworkJava2;

public class Phone {

    private String phoneName ="myPhone";
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public void call(int numberOfPhone) {

        System.out.println("try to call to number " + numberOfPhone);
    }

    public void receiveCall(int incomingCallNumber) {
        System.out.println("try to receive a call from number " + incomingCallNumber);
    }



}
