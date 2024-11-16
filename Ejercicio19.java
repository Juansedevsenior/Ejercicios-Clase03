/*Ejercicio 19 - La sucesión de Fibonacci: 0, 1, 1, 2, 3, 5, 8, 13, 21...
Esta sucesión comienza con los números 0 y 1. El siguiente miembro se calcula como la suma 
de los dos inmediatamente anteriores.
Crea un programa reciba un número (N) del usuario y muestre los primeros N números de sucesión. */

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("   SUCESIÓN FIBONACCI   ");

        System.out.print("Digita la cantidad numeros que deseas visualizar de la sucesión: ");
        var numFibonacci = scanner.nextInt();

        // 0,1,1,2,3,5,8,13,21
        
        var a = 0;
        var b = 1;
        var c = 0;

        for (int i = 0; i < numFibonacci; i++) {
            System.out.print(a + ",");

            c = a + b;
            a = b;
            b = c;
            
        }
        scanner.close();
    }

}
