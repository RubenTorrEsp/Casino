package games;

import elements.Dice;
import utils.User;
import java.util.Scanner;

public class Dados {

    User user;
    int saldo;

    int dadosValue;
    int apuesta;

    public Dados() {
        System.out.println("En proceso de creación");
    }

    public Dados(User user) {
        this.user = user;
        this.saldo = user.getMoney();
    }

    public void tirarDados() {
        Dice dice = new Dice();
        dadosValue = dice.multiLaunch(2);
    }
}
