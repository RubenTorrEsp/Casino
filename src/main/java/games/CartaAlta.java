package games;

import elements.Card;
import elements.SpanishDeck;
import utils.Texts;

import java.util.Scanner;

public class CartaAlta {
    SpanishDeck deck = new SpanishDeck();
    Scanner scanner = new Scanner(System.in);
    Texts texts = new Texts();

    Card playerCard;
    Card crupierCard;
    int playerValue;
    int crupierValue;
    int apuesta;

    public CartaAlta(){
        System.out.println(texts.highCardWellcome);
        System.out.println(texts.quantityToPlay);
        String enter = scanner.nextLine();
        try {
            int quantity = Integer.parseInt(enter);
            System.out.println(texts.correctBet(quantity));
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
    }

    public void crupierSacaCarta(){
        crupierCard = deck.newCard();
        System.out.println("El crupier ha sacado el "+crupierCard.toStringSPA());
        crupierValue =+ crupierCard.getValue();
    }

    public void checkVictory() {
        if (playerValue > crupierValue) System.out.println("Has ganado. Ahora tienes " + (apuesta * 2) + "€");
        else if (playerValue == crupierValue) System.out.println("Empate. Te quedas con "+ apuesta + "€");
        else System.out.println("Has perdido. Te quedas a 0");
    }

}
