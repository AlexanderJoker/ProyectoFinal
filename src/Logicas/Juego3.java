package Logicas;
import java.util.Random;
/**
 *
 * @author Alexander
 */
public class Juego3 {
    public static void main(String[] args) {
         int[] numeros= new int[30];
        int count = 0;
        
        while(count < 30) {
            Random r = new Random();
            int na = r.nextInt(15) + 1;
            int nvr = 0;
            
            for (int i = 0; i < 30; i++) {
                if(numeros[i] == na) {
                    nvr++;
                }
            }
            if(nvr < 2) {
                numeros[count] = na;
                count++;
            }
            
    }
        for (int i = 0; i < 30; i++) {
            System.out.print(numeros[i]+" ");
        }
    }
    }
    

