package javaex.blackjack;

import java.util.List;

public class Rule {

    public Human getWinner(List<Human> players) {
        Human highestPlayer = null;
        int highestPoint = 0;

        for (Human player : players) {
            int playerPointSum = getPointSum(player.openCards());
            if (playerPointSum > highestPoint) {
                highestPlayer = player;
                highestPoint = playerPointSum;
            }
        }

        return highestPlayer;
    }

    private int getPointSum(List<Card> cards) {
        int sum = 0;

        for (Card card : cards) {
            sum += card.getPoint();
        }

        return sum;
    }


    public int getScore() {
        return 0;
    }

    public void getWinner(Dealer dealer, Player player) {

    }

}
