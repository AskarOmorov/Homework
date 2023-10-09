package com.telran.com.homeworkJava2;

public class SmartPhone extends Phone {

    int ownNumber = 2;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void call() {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber + " ");
        super.call(63);
    }

    public void receiveCall() {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber + " ");
        super.receiveCall(69876);
    }
}
