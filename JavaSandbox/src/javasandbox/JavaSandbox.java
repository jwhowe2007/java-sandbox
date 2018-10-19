/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasandbox;

import javasandbox.Converters.RatesOfSpeed;
import javasandbox.Die;

/**
 *
 * @author CrispyElectron
 */
public class JavaSandbox {
    
    public static void equalizeDice(Die d1, Die d2) {        
        while(d1.getDieFace() != d2.getDieFace()) {
            d1.roll();
            d2.roll();
        }
    }
    
    public static Die[] generateDice(int numDice) {
        Die[] dice = new Die[numDice];
        
        for(int i = 0; i < numDice; i++) {
            dice[i] = new Die();
        }

        return dice;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Die[] dice = generateDice(5);
       
       equalizeDice(dice[0], dice[1]);
       dice[0].printDieFace();
       dice[1].printDieFace();
       dice[2].printDieFace();
       dice[3].printDieFace();
       dice[4].printDieFace();       
    }
}
