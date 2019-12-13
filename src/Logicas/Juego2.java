package Logicas;

import java.util.Random;

/**
 *
 * @author Alexander
 */
public class Juego2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
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
        for (int i = 0; i < 24; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
}
    
    

