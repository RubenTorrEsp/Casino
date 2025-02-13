package games;

import utils.User;
import java.util.Scanner;

public class Dados {

    User user;
    int saldo;

    int apuesta;

    public Dados() {
        System.out.println("En proceso de creación");
    }

    public Dados(User user) {
        this.user = user;
        this.saldo = user.getMoney();
    }

}
