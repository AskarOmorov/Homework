package com.telran.com.home3;

public abstract class ATM {

    abstract void depositCash(CreditCard creditCard, int amount);

    abstract void withdrawCash(CreditCard creditCard, int amount);

    abstract void pin(CreditCard creditCard, int pin);

}
