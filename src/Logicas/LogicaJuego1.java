/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logicas;

import java.util.Random;

/**
 *
 * @author Dark
 */
public class LogicaJuego1 {
    
    public int[] getCartas() {
        
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
            }//fin
            
        }
        
        
        return numeros;
    }
            
}
