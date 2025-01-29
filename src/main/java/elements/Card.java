package elements;

import java.util.Objects;

public class Card {
    private String rank;
    private String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toStringENG() {
        return rank + " of " + suit;
    }

    public String toStringSPA() {
        return rank + " de " + suit;
    }

    public int getValue() {
        int value = 0;
        if (Objects.equals(rank, "A") || Objects.equals(rank, "1")) {
            value = 1;
        } else if (Objects.equals(rank, "2")) {
            value = 2;
        } else if (Objects.equals(rank, "3")) {
            value = 3;
        } else if (Objects.equals(rank, "4")) {
            value = 4;
        } else if (Objects.equals(rank, "5")) {
            value = 5;
        } else if (Objects.equals(rank, "6")) {
            value = 6;
        } else if (Objects.equals(rank, "7")) {
            value = 7;
        } else if (Objects.equals(rank, "8")) {
            value = 8;
        } else if (Objects.equals(rank, "9")) {
            value = 9;
        } else if (Objects.equals(rank, "10")
                || Objects.equals(rank, "sota")) {
            value = 10;
        } else if (Objects.equals(rank, "J")
                || Objects.equals(rank, "caballo")) {
            value = 11;
        } else if (Objects.equals(rank, "Q")
                || Objects.equals(rank, "rey")) {
            value = 12;
        } else if (Objects.equals(rank, "K")) {
            value = 13;
        }
        return value;
    }

    public int getValueCourtCards(){
        int value = 0;
        if (Objects.equals(rank, "A") || Objects.equals(rank, "1")) {
            value = 1;
        } else if (Objects.equals(rank, "2")) {
            value = 2;
        } else if (Objects.equals(rank, "3")) {
            value = 3;
        } else if (Objects.equals(rank, "4")) {
            value = 4;
        } else if (Objects.equals(rank, "5")) {
            value = 5;
        } else if (Objects.equals(rank, "6")) {
            value = 6;
        } else if (Objects.equals(rank, "7")) {
            value = 7;
        } else if (Objects.equals(rank, "8")) {
            value = 8;
        } else if (Objects.equals(rank, "9")) {
            value = 9;
        } else if (Objects.equals(rank, "10")
                || Objects.equals(rank, "J")
                || Objects.equals(rank, "Q")
                || Objects.equals(rank, "K")
                || Objects.equals(rank, "sota")
                || Objects.equals(rank, "caballo")
                || Objects.equals(rank, "rey")) {
            value = 10;
        }
        return value;
    }
}
