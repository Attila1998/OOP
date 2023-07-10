/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pont;

/**
 *
 * @author patti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Pont p1=new Pont (10,20);
       Pont p2=new Pont (30,40);
       System.out.println(p1);
       System.out.println(p2);
       p1=p2;
       System.out.println(p1);
       System.out.println(p2);
       Pont p3=p1;
       System.out.println(p2);
    }
    
}
