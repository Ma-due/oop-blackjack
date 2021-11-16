package com.example.oopblackjack.domain.game;

import com.example.oopblackjack.domain.card.Card;
import com.example.oopblackjack.domain.card.CardDeck;
import com.example.oopblackjack.domain.player.Dealer;
import com.example.oopblackjack.domain.player.Gamer;
import com.example.oopblackjack.view.InputView;

public class Game {
    private final CardDeck cardDeck;
    private final Gamer gamer;
    private final Dealer dealer;
    private final InputView inputView;

    private boolean gamerBustOpt = false;
    private boolean dealerBustOpt = false;

    public Game(CardDeck cardDeck, Gamer gamer, Dealer dealer, InputView inputView) {
        this.cardDeck = cardDeck;
        this.gamer = gamer;
        this.dealer = dealer;
        this.inputView = inputView;
    }

    public boolean firstDraw() {
        for (int i = 0; i < 2; i++) {
            gamerBustOpt = gamer.drawingCard(drawCard());
            dealerBustOpt = dealer.drawingCard(drawCard());
        }

        return endGameCondition(gamerBustOpt, dealerBustOpt);
    }

    public boolean turnDraw(boolean turn) {
        if(turn) gamerBustOpt = gamerDraw();
        else dealerBustOpt = dealerDraw();

        return endGameCondition(gamerBustOpt, dealerBustOpt);
    }
    
    private boolean dealerDraw() {
        if(dealer.mustDraw()) return dealer.drawingCard(drawCard());

        return false;
    }

    private boolean gamerDraw() {
        if(!askStay()) return gamer.drawingCard(drawCard());

        return true;
    }

    public boolean askStay() {
        return gamer.isStay(inputView.inputDrawCardOpt());
    }

    private Card drawCard() {
        return cardDeck.drawCard();
    }

    private boolean endGameCondition(boolean gamerBustOpt, boolean dealerBustOpt) {
        return gamerBustOpt || dealerBustOpt;
    }
}
