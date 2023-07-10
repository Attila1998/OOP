/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author patti
 */
public class Feladat1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ArrayListbe-megye nevek(7)
        //Rendezes(abc)
        //Megye nev 'm'-kiiras
        
        ArrayList<String> megyek=new ArrayList<String>();
        megyek.add("Kolozs");
        megyek.add("Temes");
        megyek.add("Maros");
        megyek.add("Brasso");
        megyek.add("Hunyad");
        megyek.add("Kovaszna");
        
        Collections.sort(megyek);
        
        int i=0;
        for(String tempt: megyek){
            System.out.println("megye"+ ++i +":"+tempt);
        }
        System.out.print("****************************************************");
        System.out.println();
        
        
//        for(String tempt:megyek){
//        for(String tempt: megyek){
//            if(megyek.get(i)=="M")
//            System.out.println("megye"+ ++i +":"+tempt);;
//                }
//            }
//        }
    }
}
    
