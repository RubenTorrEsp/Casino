package games;

import elements.FrenchDeck;
import elements.Texts;

import java.util.Scanner;

public class BlackJack {

    public BlackJack(){
        createDeck();
        wellcome();
    }

    FrenchDeck frenchDeck = new FrenchDeck();
    Scanner scanner = new Scanner(System.in);
    Texts texts = new Texts();

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
        newCard();
        System.out.println("El valor total de sus cartas es " + value);
        while(stillInGame()) {
            System.out.println(texts.gameContinue);
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("Todavía no se puede. Pronto llegará.");
                    break;
                case "2":
                    newCard();
                    System.out.println("El valor total de sus cartas es " + value);
                    break;
                default:
                    System.out.println("Te has plantado con " + value + " puntos. A ver si hay suerte");
                    value=value+30;
                    break;
            }
        }
    }

    public void newCard(){
        int index = (int)(Math.random()*52);
        card = deck[index];
        System.out.println(card);
        value = value + frenchDeck.getValueCourtCards(card);
    }

    public boolean stillInGame(){
        boolean lessThan21 = true;

        if(value>22) lessThan21 = false;

        return lessThan21;
    }

}
