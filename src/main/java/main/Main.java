package main;

import elements.SpanishDeck;

public class Main {

    public static void main(String[] args) {

        System.out.println("Bienvenido a la app de casino");

        SpanishDeck spanishDeck = new SpanishDeck();

        for (int i=0; i<200; i++) {
            System.out.println(spanishDeck.randomCard());
        }
    }
}