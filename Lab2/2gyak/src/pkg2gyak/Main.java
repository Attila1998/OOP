/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2gyak;

/**
 *
 * @author pal.janos.attila
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Auto Reno = new Auto ("kek");
       System.out.print( Reno.toString());
       while(Reno.getSebesseg()!=120){Reno.novelSebesseg();}     
       System.out.print( Reno.toString());
      
       
       Auto Woltswagen = new Auto ("sarga");
        while(Reno.getSebesseg()!=60){Woltswagen.novelSebesseg();}
           System.out.print( Woltswagen.toString());
    }
    
}
