/*Escriba una función en la que pueda ingresar tres números enteros y diferentes. 
Imprima estos valores en orden ascendente. */

import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("Digita el primero numero: ");
        var num1 = scanner.nextInt();

        System.out.println("Digita el segundo numero: ");
        var num2 = scanner.nextInt();

        System.out.println("Digita el tercer numero: ");
        var num3 = scanner.nextInt();

        int menor, medio, mayor;

        if (num1 < num2 && num1 < num3) {
            menor = num1;

            if (num2 < num3) {
                medio = num2;
                mayor = num3;
                
            }
            else{
                medio = num3;
                mayor = num2;
            }
            
        }
        else if (num2 < num1 && num2 < num3) {
            menor = num2;

            if (num1 < num3) {
                medio = num1;
                mayor = num3;
            }
            else{
                medio = num3;
                mayor = num1;
            }
            
        }
        else{
            menor = num3;

            if (num1 < num2) {
                medio = num1;
                mayor = num2;
                
            }
            else{
                medio = num2;
                mayor = num1;
            }
        }
        System.out.println("Los numero ascendentes son: " + menor + ", " + medio + ", " + mayor);

        scanner.close();


    }

    
}