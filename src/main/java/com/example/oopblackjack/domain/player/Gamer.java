package com.example.oopblackjack.domain.player;

import com.example.oopblackjack.domain.card.Card;

import java.util.ArrayList;
import java.util.List;

public class Gamer {
    private final List<Card> GamerHand = new ArrayList<>();
    private int point = 0;

    public void drawingCard(Card card) {
        GamerHand.add(card);
        point += card.getPoint();
    }

    public String showHand() {
        StringBuilder stringBuilder = new StringBuilder();
        GamerHand.stream().map(Card::toString).forEach(stringBuilder::append);
        return stringBuilder.toString();
    }

    public boolean isBust() {
        return point > 21;
    }

    public List<Card> getGamerHand() {
        return GamerHand;
    }

    public int getPoint() {
        return point;
    }
}
