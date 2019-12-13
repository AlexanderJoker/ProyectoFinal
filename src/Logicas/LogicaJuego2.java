
package Logicas;

import java.util.Random;

/**
 *
 * @author Alexander
 */
public class LogicaJuego2 {
   public int[] getCartas() {
        
        int[] numeros = new int[24];
        int count = 0;
        
        while(count < 24) {
            Random r = new Random();
            int na = r.nextInt(12) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 24; i++) {
                if(numeros[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numeros[count] = na;
                count++;
            }
            
        }
        
        
        return numeros;
    }
             
}
