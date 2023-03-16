package games;

import elements.FrenchDeck;
import elements.Texts;

import java.util.Scanner;

public class BlackJack {

    public BlackJack(){
        deck = new FrenchDeck();
        wellcome();
    }

    FrenchDeck deck;
    Scanner scanner = new Scanner(System.in);
    Texts texts = new Texts();

    int value;
    int money;

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
        deck.newCard();
        deck.newCard();
        System.out.println("El valor total de sus cartas es " + value);
        while(stillInGame()) {
            System.out.println(texts.gameContinue);
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("Todavía no se puede. Pronto llegará.");
                    break;
                case "2":
                    deck.newCard();
                    System.out.println("El valor total de sus cartas es " + value);
                    break;
                default:
                    System.out.println("Te has plantado con " + value + " puntos. A ver si hay suerte");
                    crupierPlays();
                    value=50;
                    break;
            }
        }
    }

    public boolean stillInGame(){
        boolean lessThan21 = true;
        if(value>22) lessThan21 = false;
        return lessThan21;
    }

    public int crupierPlays(){
        int values = 0;

        while (values<16){
            values++;
        }

        if(values>21) System.out.println("El crupier se ha pasau. To pa ti");
        else if(values>value) System.out.println("La banca gana. A mamarla a parla");
        else if(values==value) System.out.println("Empate. No me acuerdo que pasa");
        else System.out.println("Has ganado. MAQUINON!!");

        return values;
    }
}
