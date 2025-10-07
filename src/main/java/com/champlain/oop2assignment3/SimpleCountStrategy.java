package com.champlain.oop2assignment3;

public class SimpleCountStrategy implements ScoringStrategy {
    @Override
    public int calculateScore(CardCollection pCards) {
        int Count = 0;
        for (Card card : pCards) {
            Count++;
        }
        return Count;
    }

}
