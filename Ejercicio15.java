/*Escriba un programa en el que ingrese un número y le diga si es positivo o negativo. 
Repita el proceso hasta que se ingrese el número cero. */

import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        var number = 1;

        while (number != 0) {
            System.out.println("Digita un numero: ");
            number = scanner.nextInt();

            if (number > 0) {
                System.out.println("El numero ingresado es positivo");

            } else {
                System.out.println("El numero es negativo");
            }

        }
        System.out.println("Fin del programa, ingresaste un cero");

        scanner.close();

    }

}
