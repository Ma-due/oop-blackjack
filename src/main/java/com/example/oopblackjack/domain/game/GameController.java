package com.example.oopblackjack.domain.game;

import com.example.oopblackjack.domain.card.CardDeck;
import com.example.oopblackjack.domain.player.Dealer;
import com.example.oopblackjack.domain.player.Gamer;
import com.example.oopblackjack.view.InputView;

public class GameController {

    private final Game game;

    private boolean GameEndContion = false;

    public GameController() {
        CardDeck cardDeck = new CardDeck();
        Gamer gamer = new Gamer();
        Dealer dealer = new Dealer();
        InputView inputView = new InputView();
        game = new Game(cardDeck, gamer, dealer, inputView);
    }

    public void run() {
        GameEndContion = game.firstDraw();
    }
}
