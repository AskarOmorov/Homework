package com.telran.com.Home10;

public class Auto {

    private int number;
    private String color;
    private String model;
    private int mileage;
    private int price;
    private UniqueBrand uniqueBrand;

    public Auto(int number, String color, String model, int mileage, int price) {
        this.number = number;
        this.color = color;
        this.model = model;
        this.mileage = mileage;
        this.price = price;
    }

    public Auto(int number, String color, UniqueBrand uniqueBrand, int mileage, int price) {

        this.number = number;
        this.color = color;
        this.uniqueBrand = uniqueBrand;
        this.mileage = mileage;
        this.price = price;
    }

    public UniqueBrand getUniqueBrand() {
        return uniqueBrand;
    }

    public void setUniqueBrand(UniqueBrand uniqueBrand) {
        this.uniqueBrand = uniqueBrand;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "number=" + number +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                ", price=" + price +
                ", uniqueBrand=" + uniqueBrand +
                '}';
    }
}
