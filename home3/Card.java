package com.telran.com.home3;

public class Card {

    private static int number = 12345678;
    private static int pin = 789;
    private static int amount = 325587;
    private String EUR;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public static int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getEUR() {
        return EUR;
    }

    public void setEUR(String EUR) {
        this.EUR = EUR;
    }

}
