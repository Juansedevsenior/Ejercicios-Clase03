/* Escriba un programa que permita ingresar un número 
y determine si es divisible por dos y siete.*/

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Digite un numero al azar: ");
        var number1 = scanner.nextDouble();

        if (number1 %2 == 0 && number1 %7 == 0) {
            System.out.println("El numero " + number1 + " es divisible entre 2 y 7");
            
        }
        else{
            System.out.println("El numero " + number1 + " no es divisible entre 2 y 7 ");
        }

        scanner.close();
    }
    
}
