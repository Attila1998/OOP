/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feladat2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patti
 */
public class Irka {
     protected  String nev;
     protected double ar;

    public Irka() {
    }

    protected Irka(String nev, double ar) {
        this.nev = nev;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public double getAr() {
        return ar;
    }

    public void setAr(double ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return "Irka{" + "nev=" + nev + ", ar=" + ar + '}';
    }
     
     ArrayList<Irka> irkafirka=new ArrayList<Irka>();
     
     
     
     public void beolvas1(String filename){
         File file =new File(filename);
         try{
             Scanner scanner1=new Scanner(file);
             while(scanner1.hasNextLine()){
            String s1=scanner1.nextLine();
            double a =Double.parseDouble(scanner1.nextLine());
            Fuzetek f1= new Fuzetek(s1,a);
            irkafirka.add(f1);
         }
         }
         catch(Exception ex){   
             System.out.println("File does not exist");
            System.exit(1);}
}
  
     public void kiir(){
     for(Irka i: irkafirka)
         System.out.println(i);
     }
     
        public void beolvas2(String filename){
         File file =new File(filename);
         try{
             Scanner scanner2=new Scanner(file);
             while(scanner2.hasNextLine()){
                    String line=scanner2.nextLine();
                    String[]t=line.split(",");
            String s1=t[0].trim();
            double a =Double.parseDouble(t[1].trim());
                String ISBN = t[2].trim();
            Konyvek f1= new Konyvek (ISBN,s1,a);
            irkafirka.add(f1);
         }
         }
         
         
         catch(Exception ex){   
             System.out.println("File does not exist");
            }
}
     
}
