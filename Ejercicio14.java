/* Realice un programa en el que ingrese un número y muestre el cubo. 
Repita el proceso hasta que se introduzca un valor negativo.*/

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        var number = 0;
        
        while (number >= 0) {
            System.out.print("Digita un numero: ");
            number = scanner.nextInt();
            var cubo = number * number * number;

            if (number >= 0) {
                System.out.println("El cubo del numero ingresado es: " + cubo);
            }
            else{
                System.out.println("Error");
            }

        }
        System.out.println("Has digitado un numero negativo");

        scanner.close();
        
    }
    
}
