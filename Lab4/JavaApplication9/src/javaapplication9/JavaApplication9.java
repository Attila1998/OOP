/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author patti
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
         System.out.println("A erteke: ");
         int a = sc.nextInt();
         System.out.println("B erteke: ");
         int b = sc.nextInt();
         System.out.println("C erteke: ");
         int c = sc.nextInt();
         
         if((a>b) && (a>c))
         { System.out.print("A a legnagyobb,gyoke: ");
          System.out.println(Math.sqrt(a));
         }
         if((b>a) && (b>c))
         { System.out.println("B a legnagyobb,gyoke: ");
          System.out.println(Math.sqrt(b));
         }
         if((c>b) && (c>a))
         { System.out.println("C a legnagyobb,gyoke: ");
          System.out.println(Math.sqrt(c));
            }
                    
            
    }
    
}
