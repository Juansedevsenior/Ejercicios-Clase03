/*Escriba un programa que genere 120 números aleatorios entre -100 y 100. Imprime los siguientes cálculos:

Sumar los valores positivos.
Sumar los valores negativos.
Calcule la media de los números negativos.
Calcule la media de los números positivos.
Cuente la cantidad de ceros. */

import java.util.Random;

public class Ejercicio18 {
    public static void main(String[] args) {
        Random random = new Random();

        var sumPositivos = 0;
        var sumNegativos = 0;
        var contPositivos = 0;
        var contNegativos = 0;
        var contCeros = 0;

        for (int i = 0; i < 120; i++) {
            var numeroAleatorio = random.nextInt(201) - 100;
            System.out.println("Numero" + (i+1) + ":" + numeroAleatorio);

            if (numeroAleatorio > 0) {
                sumPositivos += numeroAleatorio;
                contPositivos++;
            }
            else if (numeroAleatorio < 0) {
                sumNegativos += numeroAleatorio;
                contNegativos++;
            }
            else{
                contCeros++;
            }
        }

        //Calcular las medias
        double mediaPositivos = 0;
        if (contPositivos > 0) {
            mediaPositivos = sumPositivos / contPositivos;
        }

        double mediaNegativos = 0;
        if (contNegativos > 0) {
            mediaNegativos = sumNegativos / contNegativos;
        }

        //Imprimir por pantalla los resultados

        System.out.println("La suma de los numeros positivos es: " + sumPositivos);
        System.out.println("La suma de los numeros negativos es: " + sumNegativos);
        System.out.println("La media de los positivos es: " + mediaPositivos );
        System.out.println("La media de los negativos es: " + mediaNegativos);
        System.out.println("La cantidad de ceros es: " + contCeros);


    }
    
}
