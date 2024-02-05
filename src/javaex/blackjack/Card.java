package javaex.blackjack;


public class Card {
    private String pattern;
    private String ggut;

    public Card(String pattern, String ggut) {
        this.pattern = pattern;
        this.ggut = ggut;
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
