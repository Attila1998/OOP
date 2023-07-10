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
public class Bankszamla {
    
    private double egyenleg;
    
    public Bankszamla(double osszeg)
    {egyenleg=osszeg;}
    
    public void betesz(double osszeg)
    {egyenleg += osszeg;}
    
    public boolean kivesz(double osszeg)
    { if(osszeg <= egyenleg)
        {
            egyenleg -= osszeg;
            return true;
        }
    System.out.println("You Don`t have enought money!");
    return false;
    }
    
    
    
    public double getEgyenleg()
    {return egyenleg;}
}
    

