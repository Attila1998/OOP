/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author patti
 */
public class Bankszamla {

    private double egyenleg;

    public Bankszamla(double egyenleg) {
        this.egyenleg = egyenleg;
    }
    
    public Bankszamla()
    {
    }
    
    public void betesz(double osszeg) {
        egyenleg += osszeg;
    }

    public double getEgyenleg() {
        return egyenleg;
    }


}
