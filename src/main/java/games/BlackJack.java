package games;

import elements.Card;
import elements.FrenchDeck;
import utils.Texts;
import utils.User;

import java.util.Scanner;

public class BlackJack {

    Scanner scanner = new Scanner(System.in);
    Texts texts = new Texts();
    FrenchDeck deck;
    Card card;
    User user;
    int playerValue;
    int crupierValue;
    int money;
    int ahorros;
    Boolean continueGame = true;

    public BlackJack(User user){
        deck = new FrenchDeck();
        deck.shuffleCards();
        wellcome(user);
    }

    public void wellcome(User user){
        this.user = user;
        this.ahorros = user.getMoney();
        System.out.println(texts.blackJackWellcome+"\n"+texts.quantityToPlay);
        String enter = scanner.nextLine();
        try {
            money = Integer.parseInt(enter);
            System.out.println(texts.correctBet(money));
            ahorros = ahorros - money;
            System.out.println("Te quedan "+ahorros+" en la cartera");
            game();
        } catch (Exception e) {
            System.out.println("Lo siento, pero "+enter+" no es una cantidad válida. Anda a tomar por culo.");
        }
    }

    public void game(){
        playerNewCard();
        playerNewCard();
        System.out.print("El valor total de sus cartas es " + playerValue + ".");
        while(continueGame) {
            System.out.println(texts.blackJackGameContinue);
            switch (scanner.nextLine()) {
                case "1" -> System.out.println(texts.notImplemented);
                case "2" -> {
                    playerNewCard();
                    System.out.print(texts.totalValue(playerValue));
                    if (playerValue > 21) continueGame = false;
                }
                default -> {
                    System.out.println(texts.stucked(playerValue));
                    crupierPlays();
                    continueGame = false;
                }
            }
        }
        checkVictory();
    }

    public void playerNewCard(){
        card = deck.newCard();
        System.out.println(card.toStringENG());
        playerValue = playerValue + card.getValueCourtCards();
    }

    public void crupierNewCard(){
        card = deck.newCard();
        System.out.println(card.toStringENG());
        crupierValue = crupierValue + card.getValueCourtCards();
    }

    public void crupierPlays(){
        while (crupierValue<16){
            do {
                crupierNewCard();
            } while (crupierValue < playerValue);
        }
        System.out.print(texts.crupierValue(crupierValue));
    }

    public void checkVictory(){
        if (playerValue > 21) {
            System.out.println(" Te has pasado.");
            money = 0;
        }
        else if (crupierValue > playerValue && crupierValue <= 21) {
            System.out.println(" La banca gana.");
            money = 0;
        }
        else if (crupierValue == playerValue) {
            System.out.println(" Empate. No pierdes, pero no te flipes que tampoco ganas.");
            ahorros = ahorros + money;
        }
        else {
            System.out.println(" Has ganado. MAQUINON!!");
            ahorros = ahorros + (money*2);
        }
        System.out.println("Ahora tienes "+ahorros+" euros.");
    }
}
