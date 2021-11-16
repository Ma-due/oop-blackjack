package com.example.oopblackjack.domain.player;

import com.example.oopblackjack.domain.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private final List<Card> GamerHand = new ArrayList<>();
    private int point = 0;

    public boolean drawingCard(Card card) {
        GamerHand.add(card);
        point += card.getPoint();
        return isBust();
    }

    public boolean isStay(int input) {
        return input == 1;
    }

    private boolean isBust() {
        return point > 21;
    }
}