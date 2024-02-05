package javaex.blackjack;


import java.util.ArrayList;
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
        List<Card> cards = new ArrayList<>();
        for (String pattern : PATTERNS) {
            for (int i = 1; i <= CARD_COUNT; i++) {
                Card card = new Card(pattern,getGgut(i));
                cards.add(card);
            }
        }
        return cards;
    }

    private static String getGgut(int i) {
        String ggut;

        switch (i) {
            case 1:
                ggut = "A";
                break;
            case 11:
                ggut = "J";
                break;
            case 12:
                ggut = "Q";
                break;
            case 13:
                ggut = "K";
                break;
            default:
                ggut = String.valueOf(i);
        }
        return ggut;
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
