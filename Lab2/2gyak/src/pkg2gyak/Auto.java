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
public class Auto {
    private String szin="FEHER";
    private int sebesseg=0;
    public Auto(){
    }
    public Auto(String  szin)
    {this.szin=szin;}
    
    public int sebesseg()
    {return sebesseg;}
    
    public void novelSebesseg()
    {this.sebesseg+=10;}
    
    public String toString()
      {return szin+" "+sebesseg;}
    }

    

