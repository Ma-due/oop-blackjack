package com.example.oopblackjack.domain.game;

import com.example.oopblackjack.domain.card.Card;
import com.example.oopblackjack.domain.card.CardDeck;
import com.example.oopblackjack.domain.player.Dealer;
import com.example.oopblackjack.domain.player.Gamer;
import com.example.oopblackjack.view.InputView;

public class Game {
    private final Gamer gamer;
    private final Dealer dealer;
    private final InputView inputView;
    private final CardDeck cardDeck;

    public Game(Gamer gamer, Dealer dealer, InputView inputView, CardDeck cardDeck) {
        this.gamer = gamer;
        this.dealer = dealer;
        this.inputView = inputView;
        this.cardDeck = cardDeck;
    }

    public boolean firstDraw() {
        for (int i = 0; i < 2; i++) {
            gamer.drawingCard(drawCard());
            dealer.drawingCard(drawCard());
        }

        return endGameCondition();
    }

    public boolean turnPlay() {
        gamerTurn();
        dealerTurn();

        return endGameCondition();
    }

    public boolean askStay() {
        return inputView.inputDrawCardOpt() == 2;
    }

    private void dealerTurn() {
        if (dealer.mustDraw()) dealer.drawingCard(drawCard());
    }

    private void gamerTurn() {
        gamer.drawingCard(drawCard());
    }

    private Card drawCard() {
        return cardDeck.drawCard();
    }

    private boolean endGameCondition() {
        return gamer.isBust() || dealer.isBust();
    }

    public String makeResult() {
        GameResult gameResult = new GameResult(gamer.getPoint(), dealer.getPoint());
        if (gameResult.gamerBust() && gameResult.dealerBust()) return "DRAW";
        if (gameResult.gamerBust()) return "gamer";
        if (gameResult.dealerBust()) return "dealer";
        if (gameResult.isDrawGame()) return "draw";
        if (gameResult.getWinner()) return "dealer";

        return "gamer";
    }
}
