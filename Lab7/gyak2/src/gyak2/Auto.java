/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak2;

/**
 *
 * @author patti
 */
public class Auto {
    private String Marka;
    private int ar;

    public String getMarka() {
        return Marka;
    }

//    public int getAr() {
//        return ar;
//    }
//
//    public void setMarka(String Marka) {
//        this.Marka = Marka;
//    }
//
//    public void setAr(int ar) {
//        this.ar = ar;
//    }

    public Auto(String Marka, int ar) {
        this.Marka = Marka;
        this.ar = ar;
    }

    @Override
    public String toString() {
        return   Marka + ", ar=" + ar ;
    }
    
}
