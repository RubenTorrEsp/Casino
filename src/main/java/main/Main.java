package main;

import elements.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido a la app de casino");

        FrenchDeck spanishDeck = new FrenchDeck();

        for (int i=0; i<200; i++) {
            System.out.println(spanishDeck.randomCard());
        }
    }
}