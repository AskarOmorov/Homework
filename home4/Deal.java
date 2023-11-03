package com.telran.com.home4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Deal {

    public static void main(String[] args) {
        final int cardsForPlayer = 5;
        int players;

        final Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the number of players: ");

            if (sc.hasNextInt()) {
                players = sc.nextInt();
                if (cardsForPlayer * players <= Rank.values().length * Suit.values().length) {
                    break;
                } else {
                    if (players == 0) {
                        System.out.println("The game has been terminated.");
                        break;
                    } else if (players < 0) {
                        System.out.println("The number of players cannot be less than 0");
                    } else {
                        System.out.println("Too many players!");
                    }
                }
            } else {
                System.out.println("You have not entered a number, or your number is too large!");
            }
        }

        // Инициализация и перемешивание колоды
        Deck deck = new Deck();
        deck.shuffle();

        // Создание и раздача карт игрокам
        List<Playerc> playerList = new ArrayList<>();
        for (int i = 1; i <= players; i++) {
            Playerc player = new Playerc("Player " + i);
            List<Cards> playerHand = deck.deal(cardsForPlayer);
            for (Cards cards : playerHand) {
                player.receiveCard(cards);
            }
            playerList.add(player);
        }

        // Вывод руки каждого игрока
        for (Playerc player : playerList) {
            player.showHand();
        }
    }

    }
