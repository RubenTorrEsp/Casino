package games;

import elements.Card;
import elements.FrenchDeck;
import elements.Texts;

import java.util.Scanner;

public class BlackJack {

    Scanner scanner = new Scanner(System.in);
    Texts texts = new Texts();
    FrenchDeck deck;
    Card card;
    int playerValue;
    int crupierValue;
    int money;

    public BlackJack(){
        deck = new FrenchDeck();
        deck.shuffleCards();
        wellcome();
    }

    public void wellcome(){
        System.out.println("Bienvenido a la mesa de BlackJack\n¿Que cantidad quieres jugar?");
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
        playerNewCard();
        playerNewCard();
        System.out.println("El valor total de sus cartas es " + playerValue);
        while(stillInGame()) {
            System.out.println(texts.gameContinue);
            switch (scanner.nextLine()) {
                case "1":
                    System.out.println("Todavía no se puede. Pronto llegará.");
                    break;
                case "2":
                    playerNewCard();
                    System.out.println("El valor total de sus cartas es " + playerValue);
                    break;
                default:
                    System.out.println("Te has plantado con " + playerValue + " puntos. A ver si hay suerte");
                    crupierPlays();
                    playerValue =50;
                    break;
            }
        }
    }

    public void playerNewCard(){
        card = deck.newCard();
        System.out.println(card.toString());
        playerValue = playerValue + card.getValueCourtCards();
    }

    public void crupierNewCard(){
        card = deck.newCard();
        System.out.println(card.toString());
        crupierValue = crupierValue + card.getValueCourtCards();
    }

    public boolean stillInGame(){
        boolean lessThan21 = true;
        if(playerValue >22) lessThan21 = false;
        return lessThan21;
    }

    public void crupierPlays(){
        while (crupierValue<16){
            while (crupierValue<playerValue)
            crupierNewCard();
        }

        if(crupierValue > 21) System.out.println("El crupier se ha pasau. To pa ti");
        else if(crupierValue > playerValue) System.out.println("La banca gana. A mamarla a parla");
        else if(crupierValue == playerValue) System.out.println("Empate. No me acuerdo que pasa");
        else System.out.println("Has ganado. MAQUINON!!");
    }
}
