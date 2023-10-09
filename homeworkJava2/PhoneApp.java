package com.telran.com.homeworkJava2;

public class PhoneApp {

    public static void main(String[] args) {
        RadioPhone radioPhone = new RadioPhone();
        SmartPhone smartPhone = new SmartPhone();
        ButtonPhone buttonPhone = new ButtonPhone();

        radioPhone.call();
        radioPhone.receiveCall();
        smartPhone.call();
        smartPhone.receiveCall();
        buttonPhone.call();
        buttonPhone.receiveCall();

        Phone[] phones = {radioPhone, smartPhone, buttonPhone};
        makeCall(smartPhone);
    }

    private static void makeCall(Phone... phones) {
        for (Phone phone : phones) {
            phone.call(387);
            phone.receiveCall(346);
        }
    }
}
