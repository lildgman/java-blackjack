package javaex.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> cards;

    public Player() {
        cards = new ArrayList<>();
    }

    public void receiveCard(Card card) {
        this.cards.add(card);
        showCards();
    }

    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append("Player의 손패 \n");

        for (Card card : cards) {
            sb.append(card.toString()+"\n");
        }
        System.out.println(sb.toString());
    }

    public List<Card> openCards() {
        return this.cards;
    }
}
