package javaex.blackjack;

import java.util.ArrayList;
import java.util.List;

public class Dealer implements Human {
    private static final int CAN_RECEIVE_POINT = 16;
    private List<Card> cards;
    private boolean turn;
    private static final String NAME = "CPU";

    public Dealer() {
        this.cards = new ArrayList<>();
    }

    public void setTurn(boolean turn) {
        this.turn = turn;
    }

    @Override
    public void receiveCard(Card card) {
        if (isDrawCard()) {
            cards.add(card);
            showCards();
        } else {
            System.out.println("카드 총 합이 17 이상입니다. 더 이상 카드를 받을 수 없습니다.");
        }

    }

    private boolean isDrawCard() {
        return getPointSum() <= CAN_RECEIVE_POINT;
    }

    private int getPointSum() {
        int sum = 0;
        for (Card card : cards) {
            sum += card.getPoint();
        }

        return sum;
    }

    @Override
    public void showCards() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()+"의 패\n");

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb.toString());

    }

    @Override
    public List<Card> openCards() {
        return cards;
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

    @Override
    public String getName() {
        return NAME;
    }
}
