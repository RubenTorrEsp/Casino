package games;

import elements.FrenchDeck;

import java.util.List;

public class BlackJack {

    public BlackJack(){
        checkDeck(deck.createDeck());
    }

    FrenchDeck deck = new FrenchDeck();

    public void checkDeck(String[] list){
        for(String card:list){
            System.out.println(card);
            deck.getValueCourtCards(card);
        }
    }

}
