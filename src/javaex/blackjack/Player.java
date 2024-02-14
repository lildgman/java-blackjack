package javaex.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Player implements Human {
    private List<Card> cards;
    private boolean turn;
    private String name;


    public Player(String name) {
        this.cards = new ArrayList<>();
        this.name = name;
    }

    @Override
    public void receiveCard(Card card) {
        this.cards.add(card);
        showCards();
    }

    @Override
    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()+"의 손패 \n");

        for (Card card : cards) {
            sb.append(card.toString()+"\n");
        }
        System.out.println(sb.toString());
    }

    @Override
    public List<Card> openCards() {
        return this.cards;
    }

    @Override
    public void turnOff() {
        this.setTurn(false);
    }

    @Override
    public void turnOn() {
        this.setTurn(true);
    }

    @Override
    public boolean isTurn() {
        return this.turn;
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
