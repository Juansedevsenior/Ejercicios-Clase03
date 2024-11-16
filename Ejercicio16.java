/*Escriba un programa que permita ingresar un número mientras estos sean negativos. 
Detener cuando el número ingresado sea positivo y de cómo resultado la cantidad 
de números negativos ingresados. */ 

import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        int numero = -1;
        var contNegativos = 0;

        while (numero < 0) {
            System.out.print("Digita un numero (El programa se detendrá cuando ingreses un postivo): ");
            numero = scanner.nextInt();
            
            if (numero < 0) {
                contNegativos ++;
            }
            else{
                System.out.println("Oh, Has ingresado un numero positivo");
            }
        }
        System.out.println("La cantidad de numeros negativos ingresados fue de: " + contNegativos);
        scanner.close();


    }

}
