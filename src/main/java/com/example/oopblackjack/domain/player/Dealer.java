package com.example.oopblackjack.domain.player;

import com.example.oopblackjack.domain.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private final List<Card> dealerHand = new ArrayList<>();
    private int point = 0;

    public boolean drawingCard(Card card) {
        dealerHand.add(card);
        point += card.getPoint();
        return isBust();
    }

    public boolean isStay() {
        return point < 17;
    }

    private boolean isBust() {
        return point > 21;
    }
}
