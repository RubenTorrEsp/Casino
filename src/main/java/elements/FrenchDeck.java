package elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrenchDeck {

    private final List<Card> cards;

    public FrenchDeck(){
        String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        String[] suits = {"spades", "hearts", "clubs", "diamonds"};

        cards = new ArrayList<>();
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffleCards() {
        Collections.shuffle(cards);
    }

    public Card newCard() {
        if (cards.isEmpty()) return null;
        return cards.remove(0);
    }

}