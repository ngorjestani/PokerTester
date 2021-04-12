package edu.wctc.pocker;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Deck deck = new Deck();
        List<Card> hand = deck.getHand();
        Poker poker = new Poker();

        for (Card card : hand) {
            System.out.println(card);
        }

        System.out.println(poker.isStraight(hand));
        System.out.println(poker.isStraightFlush(hand));
        System.out.println(poker.isThreeOfAKind(hand));
        System.out.println(poker.isFourOfAKind(hand));
        System.out.println(poker.isFlush(hand));
    }
}
