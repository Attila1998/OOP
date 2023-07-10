/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

/**
 *
 * @author patti
 */
public class Fuzetek  extends Irka{

    public Fuzetek(String nev, double ar) {
        super(nev, ar);
    }

    public String getNev() {
        return nev;
    }

    public double getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return "Fuzetek adatai:" + "nev"+nev +"ar"+ ar;
    }
    
    
    
    
}
