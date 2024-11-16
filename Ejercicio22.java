/* Realizar un programa que permita controlar el juego de piedra, papel, tijera introduciendo 
P para piedra, L para papel y T para tijera por cada jugador.
El sistema debe indicar qué jugador gana la ronda o si hay empate. 
Al final de cada ronda preguntar si desea volver a jugar. */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        String jugarOtraVez;

        do {

            System.out.print("Jugador, Ingresa P para piedra, L para papel y T para tijera: ");
            char jugador1 = scanner.next().toUpperCase().charAt(0);

            System.out.print("Jugador, Ingresa P para piedra, L para papel y T para tijera: ");
            char jugador2 = scanner.next().toUpperCase().charAt(0);

            if (jugador1 == jugador2) {
                System.out.println("Jugadores empatan");

            } else if ((jugador1 == 'P' && jugador2 == 'T') ||
                    (jugador1 == 'L' && jugador2 == 'P') ||
                    (jugador1 == 'T' && jugador2 == 'L')) {
                System.out.println("Jugador 1, eres el ganador");
            } else if ((jugador2 == 'P' && jugador1 == 'T') ||
                    (jugador2 == 'L' && jugador1 == 'P') ||
                    (jugador2 == 'T' && jugador1 == 'L')) {
                System.out.println("Jugador 2, eres el ganador");
            } else {
                System.out.println("Ingresaste un dato mal, intenta de nuevo");
            }

            System.out.println("¿ Desea jugar nuevamente ? (Digite S para si o N para no continuar)");
            jugarOtraVez = scanner.next().toUpperCase();

        } while (jugarOtraVez.equals("S"));

        System.out.println("Gracias por jugar");

        scanner.close();

    }

}