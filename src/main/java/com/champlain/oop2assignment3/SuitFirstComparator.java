package com.champlain.oop2assignment3;

import java.util.Comparator;

public class SuitFirstComparator implements Comparator<Card> {
    @Override
    public int compare(Card card1, Card card2) {
        int suitCompare = card1.getSuit().compareTo(card2.getSuit());

        if (suitCompare == 0) {
            return card1.getSuit().compareTo(card2.getSuit());
        }
        return suitCompare;
    }
}
