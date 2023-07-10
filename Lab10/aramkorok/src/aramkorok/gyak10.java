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
public class gyak10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    Aramkor ari=new Aramkor();
    Ellenallas e1= new Ellenallas(0.1,100);
    Ellenallas e2= new Ellenallas (0.2,200);
    ari.HozzaAd(e1);
    ari.HozzaAd(e2);
        
    }
    
}
