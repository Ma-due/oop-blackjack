package com.example.oopblackjack.domain.player;

import com.example.oopblackjack.domain.card.CardDeck;
import org.junit.jupiter.api.Test;

class GamerTest {
    private CardDeck cardDeck = new CardDeck();
    private Gamer gamer = new Gamer();

    @Test
    void toStringTest() {
        gamer.drawingCard(cardDeck.drawCard());
        gamer.drawingCard(cardDeck.drawCard());
        gamer.drawingCard(cardDeck.drawCard());
        gamer.drawingCard(cardDeck.drawCard());
        gamer.drawingCard(cardDeck.drawCard());

        System.out.println(gamer.showGamerHand());
    }
}