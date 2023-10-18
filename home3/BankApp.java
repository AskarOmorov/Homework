package com.telran.com.home3;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {

        CreditCard creditCard = new CreditCard();
        Sparkasse sparkasse = new Sparkasse();
        PostBank postBank = new PostBank();
        RaifesenBank raifesenBank = new RaifesenBank();
        ATM bankomats[] = {
                raifesenBank, sparkasse, postBank};

        for (ATM bankomat : bankomats) {
            if (bankomat instanceof Convert) {
                Sparkasse.chekPin();
            }
        }
    }
}
