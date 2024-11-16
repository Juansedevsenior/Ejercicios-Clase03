/* Escriba un programa que permita ingresar una letra e 
identifique si la letra es mayúscula o minúscula.*/

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Digite una letra: ");
        char c = scanner.next().charAt(0);

        if (c >= 'a' && c <= 'z') {

            System.out.println("la letra es minuscula");

        } else {
            System.out.println("la letra es mayuscula");
        }

        scanner.close();
        
    }
    
}
