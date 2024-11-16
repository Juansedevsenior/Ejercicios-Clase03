/**Escriba un programa que permita ingresar un 
número real e identifique si el número es negativo, positivo o cero. */

import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.print("Ingrese un número real: ");
        
     if (scanner.hasNextDouble()) {
      double numero = scanner.nextDouble();
    if (numero > 0) {
      System.out.println("El número es positivo.");} 
            
     else if (numero < 0) {
     System.out.println("El número es negativo.");} 

    else {
     System.out.println("El número es cero.");} } 
    else {
     System.out.println("Entrada no válida. Por favor ingrese un número real.");}
    
     scanner.close();
    }
    
}
