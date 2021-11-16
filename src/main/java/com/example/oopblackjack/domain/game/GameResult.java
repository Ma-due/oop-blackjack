package com.example.oopblackjack.domain.game;

import com.example.oopblackjack.domain.card.Card;

import java.util.List;

public class GameResult {
    private static final int BLACKJACK_POINT = 21;
    private int gamerPoint;
    private int dealerPoint;

    public GameResult(int gamerPoint, int dealerPoint) {
        this.gamerPoint = gamerPoint;
        this.dealerPoint = dealerPoint;
    }

    public boolean gamerBust() {
        return gamerPoint > BLACKJACK_POINT;
    }

    public boolean dealerBust() {
        return dealerPoint > BLACKJACK_POINT;
    }

    public boolean isDrawGame() {
        return gamerPoint == dealerPoint;
    }

    public boolean getWinner() {
        return BLACKJACK_POINT - dealerPoint > BLACKJACK_POINT - gamerPoint;
    }
}
