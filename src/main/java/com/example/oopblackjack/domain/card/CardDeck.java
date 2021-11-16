package com.example.oopblackjack.domain.card;

import java.util.Collections;
import java.util.Stack;

public class CardDeck {
    private final Stack<Card> cardDeck;

    public CardDeck() {
        this.cardDeck = generateCard();
        Collections.shuffle(this.cardDeck);
    }

    private Stack<Card> generateCard() {
        Stack<Card> cards = new Stack<>();

        for (Card.Pattern pattern : Card.Pattern.values()) {
            for (Card.Denomination denomination : Card.Denomination.values()) {
                Card card = new Card(pattern, denomination);
                cards.push(card);
            }
        }

        return cards;
    }

    public Card drawCard() {
        return cardDeck.pop();
    }
}
