package games;

import elements.Pocket;
import elements.Texts;

import java.util.Locale;
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
                case 2 -> betColor();
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

    public void betColor(){
        System.out.println(texts.rouletteChooseColor);
        String selection = scanner.nextLine().toLowerCase(Locale.ROOT);
        Boolean userNumberIsBlack = null;
        switch (selection){
            case "rojo" -> userNumberIsBlack = false;
            case "negro" ->userNumberIsBlack = true;
            default -> System.out.println("Seleccion no válida");
        }

        int winnerNumber = pocket.newLaunch();
        Boolean winnerNumberIsBlack = pocket.isBlack(winnerNumber);

        if(winnerNumberIsBlack) System.out.println("El número que ha salido es el "+winnerNumber+" y es NEGRO");
        else System.out.println("El número que ha salido es el "+winnerNumber+" y es ROJO");

        if(userNumberIsBlack == winnerNumberIsBlack) System.out.println("Has ganado");
        else if(userNumberIsBlack == null);
        else System.out.println("Has perdido");
    }

}
