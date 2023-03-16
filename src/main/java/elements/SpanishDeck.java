package elements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SpanishDeck {

    private List<Card> cards;

    public SpanishDeck(){
        String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "sota", "caballo", "rey"};
        String[] suits = {"oros", "copas", "espadas", "bastos"};

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
        if (cards.isEmpty()) {
            return null;
        }
        return cards.remove(0);
    }

}
