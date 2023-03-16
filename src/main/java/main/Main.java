package main;

import elements.*;
import games.BlackJack;

import java.util.Scanner;

public class Main {

    static Texts texts = new Texts();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(texts.wellcome);
        System.out.println(texts.availableGames);

        String gameSelected = scanner.nextLine();

        switch (gameSelected){
            case "1":
                new BlackJack();
                break;
            case "2":
                System.out.println(texts.notImplemented);
                break;
            default:
                System.out.println("Gracias por jugar. Vuelva pronto.");
                break;
        }

    }

}