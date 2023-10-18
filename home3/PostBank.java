package com.telran.com.home3;

public class PostBank extends ATM{

    public void depositCash(CreditCard creditCard, int amount){}
    public void withdrawCash(CreditCard creditCard, int amount){}
    public void pin(CreditCard creditCard, int pin){}
    private String USD;

    public String getUSD() {
        return USD;
    }

    public void setUSD(String USD) {
        this.USD = USD;}

        private int name;
        private int pin;
        private int amount;

        public int getName () {
            return name;
        }

        public void setName ( int name){
            this.name = name;
        }

        public int getPin () {
            return pin;
        }

        public void setPin ( int pin){
            this.pin = pin;
        }

        public int getAmount () {
            return amount;
        }

        public void setAmount ( int amount){
            this.amount = amount;
        }


    }
