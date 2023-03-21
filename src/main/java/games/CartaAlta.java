package games;

import elements.Card;
import elements.SpanishDeck;

import java.util.Scanner;

public class CartaAlta {
    SpanishDeck deck = new SpanishDeck();
    Scanner scanner = new Scanner(System.in);
    Card playerCard;
    Card crupierCard;

    int playerValue;
    int crupierValue;
    int apuesta;

    public CartaAlta(){
        System.out.println("Bienvenido a la mesa de Carta Alta. Ganará el jugador que saque la carta más alta.");
        System.out.println("¿Cuanto quieres apostar?");
        String enter = scanner.nextLine();
        try {
            int quantity = Integer.parseInt(enter);
            System.out.println("Genial! Ahora tienes "+quantity+" euros en fichas. Gástalos bien.");
            apuesta = quantity;
            deck.shuffleCards();
            jugadorSacaCarta();
            crupierSacaCarta();
            checkVictory();
        } catch (Exception e) {
            System.out.println("Lo siento, pero "+enter+" no es una cantidad válida. Anda a tomar por culo.");
        }
    }

    public void jugadorSacaCarta(){
        playerCard = deck.newCard();
        System.out.println("Has sacado el "+playerCard.toStringSPA());
        playerValue =+ playerCard.getValue();
        System.out.println(playerValue);
    }

    public void crupierSacaCarta(){
        crupierCard = deck.newCard();
        System.out.println("El crupier ha sacado el "+crupierCard.toStringSPA());
        crupierValue =+ crupierCard.getValue();
        System.out.println(crupierValue);
    }

    public void checkVictory() {
        if (playerValue > crupierValue) System.out.println("Has ganado. Ahora tienes " + (apuesta * 2) + "€");
        else if (playerValue == crupierValue) System.out.println("Empate. Te quedas igual");
        else System.out.println("Has perdido. Te quedas a 0");
    }

}
