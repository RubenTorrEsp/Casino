package main;

import elements.*;
import games.BlackJack;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido a la app de casino");

        //SpanishDeck spanishDeck = new SpanishDeck();

        /*
        for (int i=0; i<200; i++) {
            String card = spanishDeck.randomCard();
            System.out.println(card);
            spanishDeck.getValueCourtCards(card);
        }
         */

        BlackJack blackJack = new BlackJack();

    }

}