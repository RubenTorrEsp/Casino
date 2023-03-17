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
            if (quantity<50) System.out.println("Lo siento, la cantidad apostada es demasiado baja.");
            else if (quantity>1000) System.out.println("Tu no has visto ese dinero en tu vida, hulio.");
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
        System.out.println("El valor total de sus cartas es " + playerValue + ".");
        while(playerValue < 22) {
            System.out.println(texts.blackJackGameContinue);
            switch (scanner.nextLine()) {
                case "1" -> System.out.println(texts.notImplemented);
                case "2" -> {
                    playerNewCard();
                    System.out.println(texts.totalValue(playerValue));
                }
                default -> {
                    System.out.println(texts.stucked(playerValue));
                    crupierPlays();
                    playerValue = 50;
                }
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

    public void crupierPlays(){
        while (crupierValue<16){
            do {
                crupierNewCard();
            } while (crupierValue < playerValue);
        }

        System.out.print(texts.crupierValue(crupierValue));

        if(crupierValue > playerValue && crupierValue <= 21) System.out.println(". La banca gana. A mamarla a parla.");
        else if(crupierValue == playerValue) System.out.println(". Empate. No pierdes, pero no te flipes que tampoco ganas.");
        else System.out.println(". Has ganado. MAQUINON!!");
    }
}
