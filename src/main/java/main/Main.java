package main;

import games.BlackJack;
import games.CartaAlta;
import games.Roulette;
import utils.Texts;
import utils.User;

import java.util.Scanner;

public class Main {

    static Texts texts = new Texts();
    static Scanner scanner = new Scanner(System.in);

    static Boolean correctSelection = true;

    public static void main(String[] args) {
        System.out.println(texts.wellcome);
        selectGame();
    }

    static User Ruben = new User("Ruben", 1000);

    public static void selectGame() {
        do {
            System.out.println(texts.availableGames);
            String gameSelected = scanner.nextLine();
            switch (gameSelected) {
                case "0" -> {
                    System.out.println(texts.thanks);
                    correctSelection = true;
                }
                case "1" -> {
                    new BlackJack(Ruben);
                    correctSelection = true;
                }
                case "2" -> {
                    new CartaAlta(Ruben);
                    correctSelection = true;
                }
                case "3" -> {
                    new Roulette(Ruben);
                    correctSelection = true;
                }
                default -> {
                    System.out.println(texts.notAvailable);
                    correctSelection = false;
                }
            }
        } while (!correctSelection);
    }

}