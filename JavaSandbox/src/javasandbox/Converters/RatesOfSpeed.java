/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasandbox.Converters;

/**
 *
 * @author CrispyElectron
 */
public class RatesOfSpeed {
    public static float mphToKph(float mph) {
        return mph * 1.61f;
    }
    
    public static float kphToMph(float kph) {
        return kph * 0.621f;
    }
}
