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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ugyfel ugyfel1;
         ugyfel1=new Ugyfel("Demete","Imola");
           Bankszamla szamla1=new Bankszamla(1000);
          ugyfel1.getSzamla();
          System.out.println(ugyfel1.toString());
          System.out.println(ugyfel1.getVezetekNev()+" "+ugyfel1.getKeresztNev()+"betesz 1450 Ront");
          szamla1.betesz(1450);
          ugyfel1.setSzamla(szamla1);
                  System.out.println(ugyfel1.toString());
                  
                  
             Ugyfel    ugyfel2=new Ugyfel("Szegeny","Imola");
           Bankszamla szamla2=new Bankszamla(0);
           System.out.println(ugyfel1.toString());
           //szamla2.kivesz(1450);
           System.out.println(ugyfel1.toString());
    }
    
}
