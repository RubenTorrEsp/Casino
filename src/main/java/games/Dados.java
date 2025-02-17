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
    }

    public void tirarDados() {
        Dice dice = new Dice();
        dadosValue = dice.multiLaunch(2);
    }
}
