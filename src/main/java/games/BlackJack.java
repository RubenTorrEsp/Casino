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
    String card;
    int value;
    int money;

    public void createDeck(){
        deck = frenchDeck.createDeck();
    }

    public void wellcome(){
        System.out.println("Bienvenido a la mesa de BlackJack");
        System.out.println("¿Que cantidad quieres jugar?");
        String enter = scanner.nextLine();
        try {
            int quantity = Integer.parseInt(enter);
            if (quantity<50) System.out.println("Lo siento, la cantidad apostada es demasiado baja");
            else if (quantity>1000) System.out.println("Tu no has visto ese dinero en tu vida, hulio");
            else {
                System.out.println("Genial! Ahora tienes "+quantity+" euros en fichas. Gástalos bien.");
                money = quantity;
                game();
            }
        } catch (Exception e) {
            System.out.println("Lo siento, pero "+enter+" no es una cantidad válida. Anda a tomar por culo.");
        }
    }

    public void game(){
        newCard();
        System.out.println(card+"\n¿Desea otra carta?");
        switch (scanner.nextLine()){
            case "si":
                newCard();
                System.out.println(card);
                System.out.println("El valor total de sus cartas es "+value);
                break;
            default:
                System.out.println("El valor total de sus cartas es "+value);
                break;
        }
    }

    public void newCard(){
        int index = (int)(Math.random()*52);
        card = deck[index];
        value = value + frenchDeck.getValueCourtCards(card);
    }

}
