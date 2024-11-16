/*Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo 
a la cantidad de unidades que le compren, Escriba un programa que dado 
un número de camisas retorne el precio por unidad. */

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("Digite el numero de camisas que se deseas comprar para darte un precio por unidad: ");
        var numCamisas = scanner.nextInt();

        if (numCamisas >= 1 && numCamisas <= 50) {
            System.out.println("El precio de las camisas por unidad te queda a $50.000");
        } 
        
        else if (numCamisas >= 50 && numCamisas < 100) {
            System.out.println("El precio de las camisas por unidad te queda a $45.000");
        }
        
        else if (numCamisas >= 100 && numCamisas < 150) {
            System.out.println("El precio de las camisas por unidad te queda a $40.000");
        }
        
        else if (numCamisas >= 150 && numCamisas < 200) {
            System.out.println("El precio de las camisas por unidad te queda a $35.000");
        }
        
        else if (numCamisas > 200) {
            System.out.println("El precio de las camisas por unidad te queda a $25.000");
        }

        scanner.close();

    }
}
