package games;

import elements.Dice;
import utils.Texts;
import utils.User;
import java.util.Scanner;

public class Dados {

    User user;
    int saldo;

    int dadosValue;
    int apuesta;

    int prevision;

    Texts texts = new Texts();
    Scanner scanner = new Scanner(System.in);

    public Dados() {
        System.out.println("En proceso de creación");
    }

    public Dados(User user) {
        this.user = user;
        this.saldo = user.getMoney();
        System.out.println("Bienvenido al juego Dados");
        System.out.println(texts.quantityToPlay);
        String enter = scanner.nextLine();
        try {
            int quantity = Integer.parseInt(enter);
            System.out.println(texts.correctBet(quantity));
            apuesta = quantity;
        } catch (Exception e) {
            System.out.println(texts.notValidQuantity(enter));
        }
        System.out.println("¿A qué numero apuestas?");
        enter = scanner.nextLine();
        try {
            int tiradaDeDatos = Integer.parseInt(enter);
            System.out.println("Has apostado que sale el numero "+tiradaDeDatos);
            prevision = tiradaDeDatos;
        } catch (Exception e) {
            System.out.println(texts.notValidQuantity(enter));
        }
        if (betEspecific(prevision)) System.out.println("Has ganado");
        else System.out.println("Has perdido");
    }

    public boolean betCraps() {
        boolean victoria;
        dadosValue = tirarDados();
        if (dadosValue == 7 || dadosValue == 11) victoria = true;
        else if (dadosValue == 2 || dadosValue == 3 || dadosValue == 12) victoria = false;
        else {
            //TODO: Comportamiento de la fase del punto
            return false;
        }
        return victoria;
    }

    public boolean betAny7() {

        return false;
    }

    public boolean betAnyCrap() {
        return false;
    }

    public boolean betEspecific(int bet) {
        dadosValue = tirarDados();
        System.out.println("Has tirado los dados y ha salido el numero.... "+dadosValue);
        return bet==dadosValue;
    }

    public boolean betHornBet(int bet) {
        return false;
    }

    public static int tirarDados() {
        return Dice.multiLaunch(2);
    }
}
