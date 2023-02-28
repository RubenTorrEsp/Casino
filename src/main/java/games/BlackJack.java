package games;

import elements.FrenchDeck;

import java.util.Scanner;

public class BlackJack {

    public BlackJack(){
        createDeck();
        wellcome();
    }

    FrenchDeck frenchDeck = new FrenchDeck();
    Scanner scanner = new Scanner(System.in);

    public String[] createDeck(){
        String[] deck = frenchDeck.createDeck();
        return deck;
    }

    public void wellcome(){
        System.out.println("Bienvenido a la mesa de BlackJack");
        System.out.println("¿Que cantidad quieres jugar?");
        String enter = scanner.nextLine();
        try {
            int quantity = Integer.parseInt(enter);
            System.out.println("Genial! Ahora tienes "+quantity+" euros en fichas. Gástalos bien.");
        } catch (Exception e) {
            System.out.println("Lo siento, pero "+enter+" no es una cantidad válida. Anda a tomar por culo.");
        }
    }

}
