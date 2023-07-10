/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aramkorok;


public class Ellenallas extends Alkatresz {
    
    public Ellenallas(double ar, double ertek) {
        super(ar, ertek);
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    public double getErtek() {
        return ertek;
    }

    public void setErtek(double ertek) {
        this.ertek = ertek;
    }

    @Override
    public String toString() {
        return "Ellenallas{" + '}';
    }
    
}
