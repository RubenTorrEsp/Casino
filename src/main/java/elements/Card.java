package elements;

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
        if (rank == "A" || rank == "1") {
            value = 1;
        } else if (rank == "2") {
            value = 2;
        } else if (rank == "3") {
            value = 3;
        } else if (rank == "4") {
            value = 4;
        } else if (rank == "5") {
            value = 5;
        } else if (rank == "6") {
            value = 6;
        } else if (rank == "7") {
            value = 7;
        } else if (rank == "8") {
            value = 8;
        } else if (rank == "9") {
            value = 9;
        } else if (rank == "10" || rank == "sota") {
            value = 10;
        } else if (rank == "J" || rank == "caballo") {
            value = 11;
        } else if (rank == "Q" || rank == "rey") {
            value = 12;
        } else if (rank == "K") {
            value = 13;
        }
        return value;
    }

    public int getValueCourtCards(){
        int value = 0;
        if (rank == "A" || rank == "1") {
            value = 1;
        } else if (rank == "2") {
            value = 2;
        } else if (rank == "3") {
            value = 3;
        } else if (rank == "4") {
            value = 4;
        } else if (rank == "5") {
            value = 5;
        } else if (rank == "6") {
            value = 6;
        } else if (rank == "7") {
            value = 7;
        } else if (rank == "8") {
            value = 8;
        } else if (rank == "9") {
            value = 9;
        } else if (rank == "10" || rank == "J" || rank == "Q" || rank == "K" || rank == "sota" || rank == "caballo" || rank == "rey") {
            value = 10;
        }
        return value;
    }
}
