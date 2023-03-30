package games;

import elements.Pocket;
import elements.Texts;

import java.util.Random;
import java.util.Scanner;

public class Roulette {

    Scanner scanner = new Scanner(System.in);
    Pocket pocket = new Pocket();
    Texts texts = new Texts();
    int userNumber = 37;

    public Roulette() {
        System.out.println(texts.rouletteWellcome);

        System.out.println(texts.rouletteBet);

        String selection = scanner.nextLine();

        try{
            userNumber = Integer.parseInt(selection);
            switch (userNumber){
                case 1 -> betNumber();
                default -> System.out.println(texts.notAvailable);
            }
        } catch (Exception e) {
            System.out.println(texts.notValidValue(selection));
        }

    }

    public void betNumber(){
        System.out.print(texts.rouletteChooseNumber);
        String selection = scanner.nextLine();
        try{
            userNumber = Integer.parseInt(selection);
        } catch (Exception e) {
            System.out.println(selection + " no es un número válido");
        }

        int winnerNumber = pocket.newLaunch();
        System.out.println("El número ganador es: " + winnerNumber);

        if (userNumber == winnerNumber) {
            System.out.println("Felicidades, has ganado!");
        } else {
            System.out.println("Lo siento, no has ganado.");
        }
    }

}
