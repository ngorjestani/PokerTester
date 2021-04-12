package edu.wctc.pocker;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Poker {
    public boolean isStraight(List<Card> hand) {
        hand.sort(Comparator.comparing(Card::getSuit)
                .thenComparing(Card::getScore));
        boolean isTheHand = true;
        int prevScore = 0;
        int score = 0;
        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            if ((score != prevScore+1) && (i != 0)) isTheHand = false;
            prevScore = score;
        }
        return isTheHand;
    }
    public boolean isStraightFlush(List<Card> hand) {
        hand.sort(Comparator.comparing(Card::getSuit)
                .thenComparing(Card::getScore));
        boolean isTheHand = true;
        int prevScore = 0;
        String prevSuit = "";
        int score = 0;
        String suit = "";
        for (int i=0;i<5;i++) {
            Card card = hand.get(i);
            score = card.getScore();
            suit = card.getSuit();
            if (((score != prevScore+1) && (i != 0)) || ((!suit.equalsIgnoreCase(prevSuit)) && (i != 0))) isTheHand = false;
            prevScore = score;
            prevSuit = suit;
        }
        return isTheHand;
    }

    public boolean isThreeOfAKind(List<Card> hand) {
        long cardOneOccurences = hand.stream()
                .filter(c -> c.getScore() == hand.get(1).getScore())
                .count();

        long cardTwoOccurences = hand.stream()
                .filter(c -> c.getScore() == hand.get(2).getScore())
                .count();

        long cardThreeOccurences = hand.stream()
                .filter(c -> c.getScore() == hand.get(3).getScore())
                .count();

        return cardOneOccurences >= 3 || cardTwoOccurences >= 3 || cardThreeOccurences >= 3;
    }

    public boolean isFourOfAKind(List<Card> hand) {
        long cardOneOccurences = hand.stream()
                .filter(c -> c.getScore() == hand.get(1).getScore())
                .count();

        long cardTwoOccurences = hand.stream()
                .filter(c -> c.getScore() == hand.get(2).getScore())
                .count();

        return cardOneOccurences >= 4 || cardTwoOccurences >= 4;
    }

    public boolean isFlush(List<Card> hand) {
        String currentSuit = hand.get(1).getSuit();

        for (Card card : hand) {
            if(!card.getSuit().equals(currentSuit)) {
                return false;
            }
        }

        return true;
    }
}
