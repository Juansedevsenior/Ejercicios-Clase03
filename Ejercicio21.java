/* Realizar un programa que permita hacer la siguiente conversión:

Millas a kilómetros.
Kilómetros a millas.
Considera que

1 milla son 1.60934 kilómetros
1 kilómetro es 0.621371 millas*/

import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Digita la cantidad de kilometros: ");
        var kilom = scanner.nextDouble();

        System.out.print("Digita la cantidad de millas: ");
        var millas = scanner.nextDouble();

         var kiloAMill = kilom * 0.621371;
         var millaAKill = millas * 1.60934;

         System.out.println("Los " + kilom + " kilometros equivalen en millas a: " + kiloAMill);
         System.out.println("Las " + millas + " millas equivalen en kilometros a: " + millaAKill);

         scanner.close();
        
    }
    
}