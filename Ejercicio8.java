/*Escriba un programa que permita ingresar un número (va a representar la cantidad de años) 
y de como respuesta la etapa en la que se encuentra 
la persona de acuerdo con la siguiente tabla. */

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Digite un número para determinar en qué etapa de edad estás en este momento: ");
        int etapaEdad = scanner.nextInt();

        if (etapaEdad >= 0 && etapaEdad <= 5) {
            System.out.println("Estás en la etapa de la primera infancia");
        } 
        
        else if (etapaEdad >= 6 && etapaEdad <= 11) {
            System.out.println("Estás en la etapa de la infancia en este momento");
        } 
        
        else if (etapaEdad >= 12 && etapaEdad <= 18) {
            System.out.println("Estás en la etapa de la adolescencia en este momento");
        } 
        
        else if (etapaEdad >= 19 && etapaEdad <= 26) {
            System.out.println("Estás en la etapa de la juventud en este momento");
        } 
        
        else if (etapaEdad >= 27 && etapaEdad <= 59) {
            System.out.println("Estás en la etapa de la adultez en este momento");
        } 
        
        else if (etapaEdad > 59) {
            System.out.println("Eres una persona mayor en este momento");
        } 
        
        else {
            System.out.println("Error: Edad no válida.");
        }

        scanner.close();
    }
}
