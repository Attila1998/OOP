/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1gyak;

/**
 *
 * @author pal.janos.attila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bankszamla szamla = new Bankszamla(1000);
        System.out.println( szamla.getEgyenleg() );
        szamla.betesz (500);
        szamla.kivesz( 2000 );
        System.out.println( szamla.getEgyenleg() );
        szamla.kivesz( 2000 );
        System.out.println( szamla.getEgyenleg() );
    }
    
}
