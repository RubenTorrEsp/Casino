package games;

import utils.User;

public class Dados {

    User user;
    int saldo;

    public Dados() {
        System.out.println("En proceso de creación");
    }

    public Dados(User user) {
        this.user = user;
        this.saldo = user.getMoney();
    }

}
