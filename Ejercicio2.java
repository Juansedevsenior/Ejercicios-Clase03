/* Escriba un programa que le permita ingresar tres números 
e imprima en la consola el más grande de ellos. */

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer numero: ");
        var numero1 = scanner.nextInt();
        
        System.out.print("Ingresa el segundo numero: ");
        var numero2 = scanner.nextInt();

        System.out.print("Ingresa el tercer numero: ");
        var numero3 = scanner.nextInt();


        if (numero1 > numero2 && numero1 > numero3) {
            System.out.printf("El numero %d es el mayor de los 3", numero1);
            
        }
        else if (numero2 > numero1 && numero2 > numero3) {
            System.out.printf("El numero %d es el mayor de los 3", numero2);
            
        }
        else{
            System.out.printf("El numero %d es el mayor de los 3", numero3);
        }

        scanner.close();


    }
    
}
