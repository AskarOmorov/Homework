package com.telran.com.home3;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class Sparkasse extends ATM implements Convert {

    static Scanner scanner = new Scanner(
            System.in);


    public static void convert(int EUR) {
        Double USD = EUR * 1.112;
    }

    public void depositCash(CreditCard creditCard, int amount) {
    }

    public void withdrawCash(CreditCard creditCard, int amount) {
    }

    public void pin(CreditCard creditCard, int pin) {
    }

    public String getUSD() {
        return USD;
    }

    public void setUSD(String USD) {
        this.USD = USD;
    }

    private String USD;
    private int name;
    private int pin;
    private int amount;

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public static void chekPin() {

        System.out.println("Введите пароль");

        int ppin = scanner.nextInt();
        if (Card.getPin() == ppin) {
            Card card1 = new Card();
            System.out.println("Ввведите сумму вывода");
            int amountEur = scanner.nextInt();
            if (amountEur <= Card.getAmount()) {
                int ost = Card.getAmount() - amountEur;

                convert(amountEur);
                System.out.println("Получите свои деньги, остаток на счету " + ost);
            } else {
                System.out.println("Недостаточно средств");
            }

        } else {
            System.out.println("Неверный пин");
        }
    }
}

