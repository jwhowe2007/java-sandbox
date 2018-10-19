/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasandbox;

/**
 * @class Die
 * Contains the methods and attributes common to all types of dice
 * 
 * @author CrispyElectron
 */
public class Die {
    private int dieFace;
    
    // Use a six-sided die by default
    private final int sidedness;
    
    /**
     * @func Die
     * 
     * Default constructor
     * Sets dieFace to 1 and sidedness to 6, resembling a normal die.
     */
    Die() {        
        this.sidedness = 6;
        this.dieFace = (int)((Math.random() * this.sidedness) + 1);
    }
    
    /**
     * @func Die
     * 
     * Constructor that takes a number of sides as an argument,
     * creating an n-sided die.
     * @param sides 
     */
    Die(int sides) {        
        this.sidedness = sides;
        this.dieFace = (int)((Math.random() * this.sidedness) + 1);
    }
    
    /**
     * @func public roll
     * 
     * Rolls the die, randomizing the dieFace value within [1, n],
     * where n is the sidedness of the die.
     */
    public void roll() {
        this.dieFace = (int)((Math.random() * this.sidedness) + 1);
    }
    
    public int getDieFace() {
        return this.dieFace;
    }
    
    public void printDieFace() {
        System.out.println(this.dieFace);
    }
}