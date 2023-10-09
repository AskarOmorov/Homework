package com.telran.com.homeworkJava2;

public class RadioPhone extends Phone {
    
    int ownNumber = 1;

    public int getOwnNumber() {
        return ownNumber;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void call() {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber + " ");
        super.call(468657);
    }

    public void receiveCall() {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber + " ");
        super.receiveCall(468657);
    }
}
