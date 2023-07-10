/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

/**
 *
 * @author patti
 */
public class bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bankszamla szamla = new Bankszamla(1000);
        System.out.println("Egyenleg: " + szamla.egyenleg);
        szamla.egyenleg -= 1500;
        System.out.println("Egyenleg: " + szamla.egyenleg);
    }

}
