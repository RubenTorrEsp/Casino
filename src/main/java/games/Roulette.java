package games;

import elements.Pocket;
import utils.Texts;
import utils.User;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Roulette {

    Scanner scanner = new Scanner(System.in);
    Pocket pocket = new Pocket();
    Texts texts = new Texts();
    int userNumber = 37;
    int money;

    User user;
    int ahorros;

    public Roulette(User user) {
        this.user = user;
        this.ahorros = user.getMoney();
        System.out.println(texts.rouletteWellcome);

        System.out.print(texts.quantityToPlay);
        money = Integer.parseInt(scanner.nextLine());

        System.out.println(texts.rouletteBet);
        String selection = scanner.nextLine();

        try{
            userNumber = Integer.parseInt(selection);
            switch (userNumber){
                case 1 -> betNumber();
                case 2 -> betColor();
                case 3 -> betPair();
                case 4 -> betPass();
                case 5 -> betColumn();
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
            money = money * 36;
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

        if(userNumberIsBlack == winnerNumberIsBlack) {
            System.out.println("Has ganado, ahora tienes " + (ahorros + money) + " euros.");
        }
        else if(userNumberIsBlack == null);
        else System.out.println("Has perdido, ahora tienes " + (ahorros - money) + " euros.");
    }

    public void betPair(){
        System.out.println(texts.rouletteChoosePair);
        String selection = scanner.nextLine().toLowerCase(Locale.ROOT);
        Boolean userNumberIsPair = null;
        switch (selection){
            case "par" -> userNumberIsPair = true;
            case "impar" -> userNumberIsPair = false;
            default -> System.out.println(texts.notAvailable);
        }

        int winnerNumber = pocket.newLaunch();
        Boolean winnerNumberIsPair = pocket.isPair(winnerNumber);

        if(winnerNumberIsPair) System.out.println("El número que ha salido es el "+winnerNumber+" y es PAR");
        else System.out.println("El número que ha salido es el "+winnerNumber+" y es IMPAR");

        if(userNumberIsPair == winnerNumberIsPair) {
            System.out.println("Has ganado, ahora tienes " + (ahorros + money) + " euros.");
        }
        else if(userNumberIsPair == null);
        else System.out.println("Has perdido, ahora tienes " + (ahorros - money) + " euros.");
    }

    public void betPass(){
        System.out.println("Elige un valor entre PASA y FALTA");
        String selection = scanner.nextLine().toLowerCase(Locale.ROOT);
        Boolean userNumberIsPass = null;
        switch (selection){
            case "pasa" -> userNumberIsPass = true;
            case "falta" -> userNumberIsPass = false;
            default -> System.out.println(texts.notAvailable);
        }

        int winnerNumber = pocket.newLaunch();
        Boolean winnerNumberIsPass = pocket.isPass(winnerNumber);

        if(winnerNumberIsPass) System.out.println("El número que ha salido es el "+winnerNumber+" y es PASA");
        else System.out.println("El número que ha salido es el "+winnerNumber+" y es FALTA");

        if(userNumberIsPass == winnerNumberIsPass) {
            System.out.println("Has ganado, ahora tienes " + (ahorros + money) + " euros.");
        }
        else if(userNumberIsPass == null);
        else System.out.println("Has perdido, ahora tienes " + (ahorros - money) + " euros.");
    }

    public void betColumn(){
        System.out.println("Elige una columna para apostar");
        String selection = scanner.nextLine().toLowerCase(Locale.ROOT);
        String userColumn = switch (selection) {
            case "1", "2" -> selection;
            case "3" -> "0";
            default -> {
                System.out.println(texts.notAvailable);
                yield null;
            }
        };
        int numero = pocket.newLaunch();
        int columna = numero%3;

        System.out.println("Ha salido el numero "+numero);

        if(Objects.equals(userColumn, String.valueOf(columna))) System.out.println("Has ganado, ahora tienes " + (ahorros + money*2) + " euros.");
        else System.out.println("Has perdido, ahora tienes " + (ahorros - money) + " euros.");
    }

}
