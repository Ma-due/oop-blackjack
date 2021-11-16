package com.example.oopblackjack.domain.game;

import com.example.oopblackjack.domain.card.CardDeck;
import com.example.oopblackjack.domain.player.Dealer;
import com.example.oopblackjack.domain.player.Gamer;
import com.example.oopblackjack.view.OutputView;

public class GameController {

    public GameController() {
        CardDeck cardDeck = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        Game game = new Game();
    }

    public void run() {

    }
}
