package games;

import java.util.Random;
import java.util.Scanner;

public class Roulette {

    public Roulette() {
        // Inicializar la ruleta
        Random r = new Random();
        int numeroGanador = r.nextInt(37);

        // Pedir al usuario que ingrese un número
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un número entre 0 y 36: ");
        int numeroUsuario = input.nextInt();

        // Mostrar el número ganador
        System.out.println("El número ganador es: " + numeroGanador);

        // Determinar si el usuario ha ganado
        if (numeroUsuario == numeroGanador) {
            System.out.println("Felicidades, has ganado!");
        } else {
            System.out.println("Lo siento, no has ganado.");
        }
    }

}
