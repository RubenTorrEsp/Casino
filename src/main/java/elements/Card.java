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
        switch (rank){
            case "A":
            case "1":
                value = 1;
                break;
            case "2":
                value = 2;
                break;
            case "3":
                value = 3;
                break;
            case "4":
                value = 4;
                break;
            case "5":
                value = 5;
                break;
            case "6":
                value = 6;
                break;
            case "7":
                value = 7;
                break;
            case "8":
                value = 8;
                break;
            case "9":
                value = 9;
                break;
            case "10":
            case "sota":
                value = 10;
                break;
            case "J":
            case "caballo":
                value = 11;
                break;
            case "Q":
            case "rey":
                value = 12;
                break;
            case "K":
                value = 13;
                break;
        }
        return value;
    }

    public int getValueCourtCards(){
        int value = 0;
        switch (rank){
            case "A":
            case "1":
                value = 1;
                break;
            case "2":
                value = 2;
                break;
            case "3":
                value = 3;
                break;
            case "4":
                value = 4;
                break;
            case "5":
                value = 5;
                break;
            case "6":
                value = 6;
                break;
            case "7":
                value = 7;
                break;
            case "8":
                value = 8;
                break;
            case "9":
                value = 9;
                break;
            case "10":
            case "J":
            case "Q":
            case "K":
            case "sota":
            case "caballo":
            case "rey":
                value = 10;
                break;
        }
        return value;
    }
}
