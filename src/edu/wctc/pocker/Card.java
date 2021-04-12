package edu.wctc.pocker;

import java.util.Objects;

public class Card {
    private String face;
    private String suit;
    private int score;

    public Card(String face, String suit, int score) {
        this.face = face;
        this.suit = suit;
        this.score = score;
    }

    public String getFace() {
        return face;
    }

    public String getSuit() {
        return suit;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Card{" +
                "face='" + face + '\'' +
                ", suit='" + suit + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Card)) return false;
        Card card = (Card) o;
        return face.equals(card.face) && suit.equals(card.suit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(face, suit);
    }
}
