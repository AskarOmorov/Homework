package com.telran.com.homeworkJava2;

public class ButtonPhone extends Phone {

    int ownNumber;

    public int getOwnNumber() {
        return ownNumber = 3;
    }

    public void setOwnNumber(int ownNumber) {
        this.ownNumber = ownNumber;
    }

    public void call() {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber + " ");
        super.call(3456);
    }

    public void receiveCall() {
        System.out.print("The phone " + getPhoneName() + " " + ownNumber + " ");
        super.receiveCall(89584);
    }
}
