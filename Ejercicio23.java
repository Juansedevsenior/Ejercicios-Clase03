/* Realizar un programa que imprima un diamante usando caracteres de texto. 
El programa debe pedir al usuario el tamaño del diamante, 
el cual debe ser un número entero positivo impar.*/

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digita el tamaño del diamante (número entero positivo impar): ");
        int tamaño = scanner.nextInt();

        // Verificar si el tamaño es un número impar positivo
        if (tamaño <= 0) {
            System.out.println("Error: El número debe ser positivo.");
        } else if (tamaño % 2 == 0) {
            System.out.println("Error: El número debe ser impar.");
        } else {
            int mitad = tamaño / 2;

            // Parte superior del diamante
            for (int i = 0; i <= mitad; i++) {
                // Imprimir espacios
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }
                // Imprimir asteriscos
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            // Parte inferior del diamante
            for (int i = mitad - 1; i >= 0; i--) {
                // Imprimir espacios
                for (int j = 0; j < mitad - i; j++) {
                    System.out.print(" ");
                }
                // Imprimir asteriscos
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        scanner.close();
        
    }
    
}