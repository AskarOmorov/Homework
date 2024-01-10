package com.telran.com.homeEleven;
// c ча gpt
public class Test {

    public class Main {

        public static void main(String[] args) {
            // Пример данных для обработки
            String[] rawData = {
                    "User1;www.de.de;APPROVED",
                    "User2;www.ebay.de;DENIED",
                    "User2;www.amazon.de;DENIED",
                    "User1;www.ebay.blabla;ERROR"
                    // Добавьте здесь свои данные, если нужно
            };

            Storage storage = new Storage();

            // Разбор и добавление данных в хранилище
            for (String data : rawData) {
                String[] parts = data.split(";");
                if (parts.length == 3) {
                    String username = parts[0];
                    String address = parts[1];
                    Answer answer = Answer.valueOf(parts[2]);
                    storage.addRequest(username, address, answer);
                }
            }

            // Вывод статистики для выбранного пользователя
            String selectedUser = "User1"; // Измените на нужного пользователя
            storage.displayStatistics(selectedUser);
        }
    }}
