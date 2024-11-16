/* Realice un programa que genere el tablero de ajedrez en consola usando instrucciones de repetición.

| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
| B | N | B | N | B | N | B | N |
| N | B | N | B | N | B | N | B |
donde N representa al cuadro negro y B representa al cuadro blanco. */

public class Ejercicio20 {
    public static void main(String[] args) {

        for (int f = 0; f < 8; f++) {
            for (int c = 0; c < 8; c++) {
                if ((f + c) %2 == 0) {
                    System.out.print("| B " );
                    
                }
                else{
                    System.out.print("| N ");
                }
                
            }
            System.out.println(" | ");
            
        }
        
    }
    
}