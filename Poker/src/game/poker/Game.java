package game.poker;

import utilities.Card;
import utilities.Deck;

public class Game {
    private Deck deck;
    private Dealer dealer;
    private Hand hand;

    public Game(){
        deck = new Deck();
        dealer = new Dealer();
    }

    public void play(){
        System.out.println("Cards no deck" + deck.showCards().size());
        hand = dealer.Deal(deck);
        for(Card card:hand.getHand()){
            System.out.println("Carta: " + card);
        }
    }
}
