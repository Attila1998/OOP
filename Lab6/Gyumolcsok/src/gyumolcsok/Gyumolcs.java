/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyumolcsok;

/**
 *
 * @author fazakas.csongor
 */
public class Gyumolcs {                 //attributumok
    private String nev;
    private int kaloriatart;
    private int cukor;

    public Gyumolcs(String nev, int kaloriatart, int cukor) {// insert code-al lehet gyorsan s egyszeruen
        this.nev = nev;
        this.kaloriatart = kaloriatart;
        this.cukor = cukor;
    }

    public void setNev(String nev) {// insert code-al ezt is meglehet
        this.nev = nev;
    }

    public void setKaloriatart(int kaloriatart) {
        this.kaloriatart = kaloriatart;
    }

    public void setCukor(int cukor) {
        this.cukor = cukor;
    }

    public String getNev() {
        return nev;
    }

    public int getKaloriatart() {
        return kaloriatart;
    }

    public int getCukor() {
        return cukor;
    }
    
    
    

    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
