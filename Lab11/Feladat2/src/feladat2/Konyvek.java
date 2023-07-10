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
public class Konyvek extends Irka{
    
    private String ISBN;

    public Konyvek(String ISBN, String nev, double ar) {
        super(nev, ar);
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getNev() {
        return nev;
    }

    public double getAr() {
        return ar;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }



    @Override
    public String toString() {
        return "Konyveka datok:" + "ISBN" + ISBN + "nev "+ nev +"ar "+ar;
    }
    
    
}
