package javaex.blackjack;


public class Card {
    private String pattern;
    private String ggut;

    private int point;

    public int getPoint() {
        return point;
    }

    public Card(String pattern, int index) {
        this.pattern = pattern;
        this.ggut = numberToGgut(index);
        this.point = numberToPoint(index);
    }

    private static String numberToGgut(int number) {
        String ggut;

        switch (number) {
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
                ggut = String.valueOf(number);
        }
        return ggut;
    }

    private int numberToPoint(int number) {
        if (number >= 11) {
            return 10;
        }
        return number;
    }
    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public String getGgut() {
        return ggut;
    }

    public void setGgut(String ggut) {
        this.ggut = ggut;
    }

    @Override
    public String toString() {
        return "Card{" +
                "pattern='" + pattern + '\'' +
                ", ggut='" + ggut + '\'' +
                '}';
    }
}
