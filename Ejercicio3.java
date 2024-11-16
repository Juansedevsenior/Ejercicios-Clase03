/* Escriba un programa que permita ingresar un número e identificar si es par o impar. */

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite un numero al azar: ");
        var number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("El numero Digitado es par");
            
        }
        else{
            System.out.println("El numero digitado es Impar");
        }

        scanner.close();
    }
    
}
