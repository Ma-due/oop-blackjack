package com.example.oopblackjack.domain.player;

import com.example.oopblackjack.domain.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Dealer {
    private final List<Card> dealerHand = new ArrayList<>();
    private int point = 0;

    public void drawingCard(Card card) {
        dealerHand.add(card);
        point += card.getPoint();
    }

    public boolean mustDraw() {
        return point < 17;
    }

    public boolean isBust() {
        return point > 21;
    }
}
