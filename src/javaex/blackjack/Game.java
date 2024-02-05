package javaex.blackjack;

import java.util.Scanner;

public class Game {
    private static final int FIRST_RECEIVE_CARD_COUNT = 2;
    public void play() {
        System.out.println("=======Play BlackJack=======");
        Scanner sc = new Scanner(System.in);
        Dealer dealer = new Dealer();
        Player player = new Player();
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();

        firstPhase(cardDeck, player);
        playingPhase(sc, cardDeck, player);

    }

    private void playingPhase(Scanner sc, CardDeck cardDeck, Player player) {
        String playerInput;
        while (true) {
            System.out.println("카드를 뽑으시겠습니까? 아니라면 0을 누르세요");
            playerInput = sc.nextLine();

            if (playerInput.equals("0")) {
                break;
            }

            Card card = cardDeck.drawCard();
            player.receiveCard(card);
        }
    }

    private void firstPhase(CardDeck cardDeck, Player player) {
        System.out.println("2장의 카드를 뽑겠습니다.");
        for (int i = 0; i < FIRST_RECEIVE_CARD_COUNT; i++) {
            Card card = cardDeck.drawCard();
            player.receiveCard(card);
        }
    }

}
