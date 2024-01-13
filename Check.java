package com.telran.com.home12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {

    public static void main(String[] args) {

        String number = "6477647";
        Pattern pattern = Pattern.compile("\\d\\d\\d\\d\\d\\d\\d");
        Pattern pattern1 = Pattern.compile("\\d\\d\\d-\\d\\d\\d\\d");
        Pattern pattern2 = Pattern.compile("\\d\\d\\d \\d\\d\\d\\d");
        Matcher matcher = pattern.matcher(number);
        Matcher matcher1 = pattern1.matcher(number);
        Matcher matcher2 = pattern2.matcher(number);

        if (matcher.matches()) {
            System.out.println(matcher.matches());
        } else if (matcher1.matches()) {
            System.out.println(matcher1.matches());
        } else if (matcher2.matches()) {
            System.out.println(matcher2.matches());
        } else System.out.println("false");

        String email = "user@example.com"; // Замените строку на нужный адрес электронной почты

        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern3 = Pattern.compile(emailRegex);

        Matcher matcher3 = pattern3.matcher(email);
        if (matcher3.matches()) {
            System.out.println("Адрес электронной почты верен.");
        } else {
            System.out.println("Некорректный адрес электронной почты.");
        }
        String password = "Passw0rd!"; // Замените строку на нужный пароль

        String passwordRegex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*()-_+=])[a-zA-Z0-9!@#$%^&*()-_+=]{8,}$";
        Pattern pattern4 = Pattern.compile(passwordRegex);

        Matcher matcher4 = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Пароль верен.");
        } else {
            System.out.println("Некорректный пароль.");
        }
    }
}

