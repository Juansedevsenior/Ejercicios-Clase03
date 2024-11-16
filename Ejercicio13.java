
/* Tres hermanos acuerdan reunirse. Los hermanos son identificados por los siguientes números: 1 para el mayor, 
2 para el del medio y 3 para el menor.
Cuando llega la hora de la reunión, uno de los hermanos va tarde. 
Dados los números de los hermanos que llegan a tiempo, determine el número del hermano que llegará tarde.
Por ejemplo: */

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Digita el número del primer hermano que llegó a tiempo (1, 2 o 3): ");
        int hermano1 = scanner.nextInt();

        System.out.print("Digita el número del segundo hermano que llegó a tiempo (1, 2 o 3): ");
        int hermano2 = scanner.nextInt();

        // Suma total de los hermanos (1 + 2 + 3 = 6)
        int sumaTotal = 6;

        // Calcular el hermano que llegó tarde
        int hermanoTarde = sumaTotal - hermano1 - hermano2;

        System.out.println("El hermano que llegó tarde es el número: " + hermanoTarde);

        scanner.close();

    }

}