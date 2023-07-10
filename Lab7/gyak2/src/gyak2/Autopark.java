/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyak2;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patti
 */
public class Autopark {

private String autopark_vezeto;
private int autokszama;
private ArrayList<Auto>Autok;
    

    public Autopark(String f1,String f2,String f3) {
        try
     {
        File file1=new File(f1);
        Scanner scanner1=new Scanner(file1);
        
        File file2=new File(f2);
        Scanner scanner2=new Scanner(file2);
        
        File file3=new File(f3);
        Scanner scanner3=new Scanner(file3);
            autokszama=scanner3.nextInt();
            
            autopark_vezeto=scanner3.nextLine();//Enter
            autopark_vezeto=scanner3.nextLine();
            
            Autok= new ArrayList<Auto>(autokszama);
            
            for(int i=0;i<autokszama;i++)
            {
            String x=scanner1.nextLine();
            int y=scanner2.nextInt();
            Auto auto=new Auto(x,y);
            Autok.add(auto);
            }
        }
        catch(Exception ex)
        {System.out.println("Hiba!");}
    }
    
    public void kiir(){
    for(Auto x:Autok)
        System.out.println(x.toString());
        }

    public static void main(String[] args) {
       Autopark Autok1=new Autopark("Be1.txt","Be2.txt","Be3.txt");
       Autok1.kiir();
    }


    
}
