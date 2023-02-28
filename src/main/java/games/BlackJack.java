package games;

import elements.FrenchDeck;

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
