/* Escriba un programa que permita ingresar una letra e identifique si es vocal o consonante. */

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.print("Digite una letra: ");
        char letter = scanner.next().charAt(0);

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
            System.out.println("La letra difitada es vocal");
            
        }
        else{
            System.out.println("La letra difitada es consonante");
        }


        scanner.close();
        
    }
    
}
