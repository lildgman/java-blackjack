package javaex.blackjack;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Game {
    private static final int FIRST_RECEIVE_CARD_COUNT = 2;
    private static final String STOP_RECEIVE_CARD = "0";
    public void play() {
        System.out.println("=======Play BlackJack=======");
        Scanner sc = new Scanner(System.in);
        Rule rule = new Rule();
        CardDeck cardDeck = new CardDeck();

        List<Human> players = Arrays.asList(new Player("나"), new Dealer());
        List<Human> afterFirstPhasePlayers = firstPhase(cardDeck, players);
        List<Human> afterPlayingPhasePlayers = playingPhase(sc, cardDeck, afterFirstPhasePlayers);

        Human winner = rule.getWinner(afterPlayingPhasePlayers);
        System.out.println("승자는 " + winner.getName());

    }

    private List<Human> playingPhase(Scanner sc, CardDeck cardDeck, List<Human> players) {
        List<Human> cardReceivedPlayers;

        while (true) {
            cardReceivedPlayers = receiveCardAllPlayers(sc, cardDeck, players);

            if (isAllPlayerTurnOff(cardReceivedPlayers)) {
                break;
            }
        }
        return cardReceivedPlayers;
    }

    private boolean isAllPlayerTurnOff(List<Human> players) {
        for (Human player : players) {
            if (player.isTurn()) {
                return false;
            }
        }
        return true;
    }

    private List<Human> receiveCardAllPlayers(Scanner sc, CardDeck cardDeck, List<Human> players) {
        for (Human player : players) {
            System.out.println(player.getName() + "님 차례입니다.");

            if (isReceiveCard(sc)) {
                Card card = cardDeck.drawCard();
                player.receiveCard(card);
                player.turnOn();
            } else {
                player.turnOff();
            }
        }

        return players;
    }



    private boolean isReceiveCard(Scanner sc) {
        System.out.println("카드를 뽑겠습니까? 종료하실려면 0을 입력해주세요");
        return !STOP_RECEIVE_CARD.equals(sc.nextLine());
    }

    private List<Human> firstPhase(CardDeck cardDeck, List<Human> players) {

        System.out.println("2장의 카드를 뽑겠습니다.");
        for (int i = 0; i < FIRST_RECEIVE_CARD_COUNT; i++) {
            // FIRST_RECEIVE_CARD_COUNT 대신 2를 넣어도 되지만
            // 의미가 애매모호하고 변경범위를 확인하기 어렵다.
            for (Human player : players) {
                Card card = cardDeck.drawCard();
                player.receiveCard(card);
            }
        }

        return players;
    }
}
