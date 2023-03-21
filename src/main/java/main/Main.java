package main;

import elements.*;
import games.BlackJack;
import games.CartaAlta;

import java.util.Scanner;

public class Main {

    static Texts texts = new Texts();
    static Scanner scanner = new Scanner(System.in);

    static Boolean correctSelection = true;

    public static void main(String[] args) {
        System.out.println(texts.wellcome);
        selectGame();
    }

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
                    new BlackJack();
                    correctSelection = true;
                }
                case "2" -> {
                    new CartaAlta();
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