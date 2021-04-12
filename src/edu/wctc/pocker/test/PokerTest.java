package edu.wctc.pocker.test;

import edu.wctc.pocker.Card;
import edu.wctc.pocker.Deck;
import edu.wctc.pocker.Poker;
import org.junit.jupiter.api.BeforeEach;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PokerTest {
    Deck deck = new Deck();
    List<Card> hand = new ArrayList<Card>();
    Poker poker = new Poker();

    @BeforeEach
    void runIt() {
        hand.add(deck.getCard(2));
        hand.add(deck.getCard(1));
        hand.add(deck.getCard(3));
        hand.add(deck.getCard(4));
        hand.add(deck.getCard(5));
    }
    @org.junit.jupiter.api.Test
    void isStraight() {
        assertTrue(poker.isStraight(hand));
    }

    @org.junit.jupiter.api.Test
    void isStraightFlush() {
        assertTrue(poker.isStraightFlush(hand));
    }

    @org.junit.jupiter.api.Test
    void isThreeOfAKind() {
        assertFalse(poker.isThreeOfAKind(hand));
    }

    @org.junit.jupiter.api.Test
    void isFourOfAKind() {
        assertFalse(poker.isFourOfAKind(hand));
    }

    @org.junit.jupiter.api.Test
    void isFlush() {
        assertTrue(poker.isFlush(hand));
    }
}