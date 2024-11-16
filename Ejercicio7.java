/*Escriba un programa que permita ingresar tres números (representan la longitud de una línea) y 
compruebe si con estos números se puede formar un triángulo. */

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
    

        System.out.print("Digite la longitud del primer lado: ");
        double lado1 = scanner.nextDouble();

        System.out.print("Digite la longitud del segundo lado: ");
        double lado2 = scanner.nextDouble();

        System.out.print("Digite la longitud del tercer lado: ");
        double lado3 = scanner.nextDouble(); 


        if (esTriangulo(lado1, lado2, lado3)) {
            System.out.println("Los lados ingresados SI forman un triángulo.");
        } else {
            System.out.println("Los lados ingresados NO forman un triángulo."); 

        }

        scanner.close();
    }

    public static boolean esTriangulo(double lado1, double lado2, double lado3) {
        return lado1 > 0 && lado2 > 0 && lado3 > 0 &&
                lado1 + lado2 > lado3 &&
                lado1 + lado3 > lado2 &&
                lado2 + lado3 > lado1;
    }
 
}
