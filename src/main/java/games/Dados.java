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

    // TODO: REVISION
    public boolean betPassLine() {
        dadosValue = tirarDados();
        if (dadosValue == 7 || dadosValue == 11) return true;
        else if (dadosValue == 2 || dadosValue == 3 || dadosValue == 12) return false;
        else return betComeBet(dadosValue);
    }

    // TODO: REVISION
    public boolean betComeBet(int punto) {
        int nuevaTirada;
        do {
            nuevaTirada = tirarDados();
        } while (nuevaTirada != 7 && nuevaTirada != punto);
        return nuevaTirada == punto;
    }

    public int betDontPassLine() {
        dadosValue = tirarDados();
        if (dadosValue == 7 || dadosValue == 11) return -1;
        else if (dadosValue == 12) return 0;
        else if (dadosValue == 2 || dadosValue == 3) return 1;
        return betDontComeBet(dadosValue) ? 1 : 0;
    }

    public boolean betDontComeBet(int punto) {
        int nuevaTirada;
        do {
            nuevaTirada = tirarDados();
        } while (nuevaTirada != 7 && nuevaTirada != punto);
        return nuevaTirada == 7;
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
