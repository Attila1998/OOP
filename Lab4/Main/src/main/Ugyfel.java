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
public class Ugyfel {

    private  String vezetekNev;
    private  String keresztNev;

    private Bankszamla szamla;

    public Ugyfel(String vezetekNev, String keresztNev) {
        this.vezetekNev = vezetekNev;
        this.keresztNev = keresztNev;
    }

    public String getKeresztNev() {
        return keresztNev;
    }

    public String getVezetekNev() {
        return keresztNev;
    }

    public void setSzamla(Bankszamla szamla) {
        this.szamla = szamla;
    }

    public Bankszamla getSzamla() {
        return szamla;
    }
    
    public String toString()
    {
        return vezetekNev+" "+keresztNev+" "+getSzamla().getEgyenleg();
    }
}
