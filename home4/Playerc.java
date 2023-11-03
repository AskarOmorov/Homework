package com.telran.com.home4;

import java.util.ArrayList;
import java.util.List;

public class Playerc {


        private final String name;
        private final List<Cards> hand;

        public Playerc(String name) {
            this.name = name;
            hand = new ArrayList<>();
        }

        public void receiveCard(Cards cards) {

            hand.add(cards);
        }

        public void showHand() {
            System.out.println(name + "'s hand:");
            for (Cards card : hand) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

