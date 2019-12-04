/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasandbox;

/**
 *
 * @author CrispyElectron
 */
public class JavaSandbox {
    public static void printReverse(String[] stringSet) {
        int strings = stringSet.length;
        
        for(int i = (strings - 1); i >= 0; i--) {
            System.out.println(stringSet[i]);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        
        printReverse(weekdays);        
    }
}
