package com.telran.com.Home10;

public class Phones {

    private int phoneNumbers;
    private  Enum typeOfPhone;

    public Phones(int phoneNumbers, TypeOfPhone typeOfPhone) {
        this.phoneNumbers = phoneNumbers;
        this.typeOfPhone = typeOfPhone;
    }

    public int getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(int phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public Enum<TypeOfPhone> getTypeOfPhone() {
        return typeOfPhone;
    }

    public void setTypeOfPhone(Enum<TypeOfPhone> typeOfPhone) {
        this.typeOfPhone = typeOfPhone;
    }
}
