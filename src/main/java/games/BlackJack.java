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
    String[] deck;

    public String[] createDeck(){
        deck = frenchDeck.createDeck();
        return deck;
    }

    public void wellcome(){
        System.out.println("Bienvenido a la mesa de BlackJack");
        System.out.println("¿Que cantidad quieres jugar?");
        String enter = scanner.nextLine();
        try {
            int quantity = Integer.parseInt(enter);
            System.out.println("Genial! Ahora tienes "+quantity+" euros en fichas. Gástalos bien.");
            game();
        } catch (Exception e) {
            System.out.println("Lo siento, pero "+enter+" no es una cantidad válida. Anda a tomar por culo.");
        }
    }

    public void game(){
        int value = 0;
        int index = (int)(Math.random()*52);
        String card = deck[index];
        value = value + frenchDeck.getValueCourtCards(card);
        System.out.println(card+"\n¿Desea otra carta?");
        switch (scanner.nextLine()){
            case "si":
                index = (int)(Math.random()*52);
                card = deck[index];
                value = value + frenchDeck.getValueCourtCards(card);
                System.out.println(card);
                System.out.println("El valor total de sus cartas es "+value);
                break;
            default:
                System.out.println("El valor total de sus cartas es "+value);
                break;
        }
    }

    public void newCard(){

    }

}
