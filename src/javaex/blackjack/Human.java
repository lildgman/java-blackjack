package javaex.blackjack;

import java.util.List;

public interface Human {
    void receiveCard(Card card);

    void showCards();

    List<Card> openCards();

    void turnOff();

    void turnOn();

    boolean isTurn();

    String getName();

}
