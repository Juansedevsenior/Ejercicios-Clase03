/* Escriba una función en la que ingrese un número entero entre 1 y 12. E
ste número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). 
El resultado debe ser el número de días del mes ingresado. */

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digita un numero entre 1 y 12 para saber la cantidad de días del mes: ");
        var numMes = scanner.nextInt();

        if (numMes == 1 || numMes == 3 || numMes == 5 || numMes == 7 || numMes == 8 || numMes == 10 || numMes == 12) {
            System.out.println("31");
        } 
        else if (numMes == 4 || numMes == 6 || numMes == 9 || numMes == 11) {
            System.out.println("30");
        } 
        else if (numMes == 2) {
            System.out.println("28");
        }
        else{
            System.out.println("Error, el numero de mes digitado no existe");
        }

        scanner.close();
    }
}
