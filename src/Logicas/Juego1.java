
package Logicas;

import java.util.Random;

/**
 *
 * @author Alexander
 */
public class Juego1 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] numeros = new int[12];
        int count = 0;
        
        while(count < 12) {
            Random r = new Random();
            int na = r.nextInt(6) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 12; i++) {
                if(numeros[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numeros[count] = na;
                count++;
            }
            
    }
        for (int i = 0; i < 12; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
