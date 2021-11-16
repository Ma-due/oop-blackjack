package com.example.oopblackjack.domain.game;

import com.example.oopblackjack.domain.card.Card;
import com.example.oopblackjack.domain.card.CardDeck;
import com.example.oopblackjack.domain.player.Dealer;
import com.example.oopblackjack.domain.player.Gamer;

import java.util.Stack;

public class Game {

    private final CardDeck cardDeck;
    private final Gamer gamer;
    private final Dealer dealer;

    public Game(CardDeck cardDeck, Gamer gamer, Dealer dealer) {
        this.cardDeck = cardDeck;
        this.gamer = gamer;
        this.dealer = dealer;
    }
}
