/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aramkorok;

/**
 *
 * @author patti
 */
public class Alkatresz {
    
    public double ar;
    public double ertek;

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

    public Alkatresz(double ar, double ertek) {
        this.ar = ar;
        this.ertek = ertek;
    }

    @Override
    public String toString() {
        return "Alkatresz{" + "ar=" + ar + ", ertek=" + ertek + '}';
    }
    
    
}
