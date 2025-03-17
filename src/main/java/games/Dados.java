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

    public double betOddsBet(int punto, boolean isPassLine, double betAmount) {
        int nuevaTirada;

        do {
            nuevaTirada = tirarDados();
        } while (nuevaTirada != 7 && nuevaTirada != punto);

        boolean gano = (isPassLine && nuevaTirada == punto) || (!isPassLine && nuevaTirada == 7);
        double payoutMultiplier = getOddsPayout(punto);
        return gano ? betAmount * payoutMultiplier : -betAmount;
    }

    // Método auxiliar para determinar el pago de la apuesta Odds
    private double getOddsPayout(int punto) {
        return switch (punto) {
            case 4, 10 -> 2.0;  // Paga 2 a 1
            case 5, 9 -> 1.5;  // Paga 3 a 2
            case 6, 8 -> 1.2;  // Paga 6 a 5
            default -> 0; // No debería ocurrir, pero por seguridad
        };
    }

    private boolean betPlaceBets(int numero) {
        int nuevaTirada;
        do {
            nuevaTirada = tirarDados();
        } while (nuevaTirada != 7 && nuevaTirada != numero);
        return nuevaTirada == numero;
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
