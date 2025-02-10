package games;

import elements.Card;
import elements.SpanishDeck;
import utils.Texts;
import utils.User;

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

    User user;
    int ahorros;

    public CartaAlta(User user){
        this.user = user;
        this.ahorros = user.getMoney();
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
            System.out.println(notValidQuantity(enter));
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
        if (playerValue > crupierValue) System.out.println("Has ganado. Ahora tienes " + (ahorros + (apuesta * 2)) + "€");
        else if (playerValue == crupierValue) System.out.println("Empate. Te quedas con "+ (ahorros - apuesta) + "€");
        else System.out.println("Has perdido. Te quedas con " + ahorros);
    }

}
