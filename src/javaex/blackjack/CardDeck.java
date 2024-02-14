package javaex.blackjack;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class CardDeck {
    private List<Card> cards;
    private final String[] PATTERNS = {"SPADE", "CLOVER", "DIAMOND", "HEART"};
    private final int CARD_COUNT = 13;

    public CardDeck() {
        cards = generateCards();
    }

    private List<Card> generateCards() {
        List<Card> cards = new LinkedList<>();

        for (String pattern : PATTERNS) {
            for (int i = 1; i <= CARD_COUNT; i++) {
                Card card = new Card(pattern, i);
                cards.add(card);
            }
        }
        return cards;
    }

    public Card drawCard() {
        Card randomCard = getRandomCard();
        cards.remove(randomCard);
        return randomCard;
    }

    private Card getRandomCard() {
        int random = (int) (Math.random() * cards.size());
        return cards.get(random);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Card card : cards) {
            sb.append(card.toString());
            sb.append("\n");
        }

        return sb.toString();
    }
}
