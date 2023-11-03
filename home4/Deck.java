package com.telran.com.home4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private final List<Cards> cards;

    public Deck() {
        cards = new ArrayList<>();
        for (Rank rank : Rank.values()) {
            for (Suit suit : Suit.values()) {
                cards.add(new Cards(rank, suit));
            }
        }
    }

    public void shuffle() {

        Collections.shuffle(cards);
    }

    public List<Cards> deal(int numCards) {
        List<Cards> dealtCards = new ArrayList<>();
        for (int i = 0; i < numCards; i++) {
            dealtCards.add(cards.remove(0));
        }
        return dealtCards;
    }
}


