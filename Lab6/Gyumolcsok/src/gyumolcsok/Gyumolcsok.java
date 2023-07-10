/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gyumolcsok;

public class Gyumolcsok {

    public int maxgy;
    private int gyumolcsokszama;
    private Gyumolcs Gyumolcsok[];

    public Gyumolcsok() {
        maxgy = 50;
        gyumolcsokszama = 0;
        Gyumolcsok = new Gyumolcs[maxgy];
    }

    public void ujGyumolcs(String nev, Integer kaloriatart, Integer cukor) {
        if (gyumolcsokszama > maxgy) {
            System.out.println("HIBA");
        } else {
            Gyumolcs gyumolcs1 = new Gyumolcs(nev, kaloriatart, cukor);
            Gyumolcsok[gyumolcsokszama] = gyumolcs1;
            gyumolcsokszama++;
        }

    }

    public Gyumolcs GetGyumolcs(Gyumolcs gyumolcs1) {
        return gyumolcs1;
    }

    public int GetGyumolcsokszama(Gyumolcsok gyumolcs1){
        return gyumolcsokszama;
    }

    public static void main(String[] args) {
        Gyumolcs gyumolcs = new Gyumolcs("Kaki",126,34);
  /*      System.out.print(gyumolcslol.getNev()+" ");
        System.out.print(gyumolcslol.getKaloriatart()+" ");
        System.out.print(gyumolcslol.getCukor()+" ");
        System.out.println();
   */     
        Gyumolcs gyumolcs = new Gyumolcs("Alma",57,15);
    /*    System.out.print(gyumolcs2.getNev()+" ");
        System.out.print(gyumolcs2.getKaloriatart()+" ");
        System.out.print(gyumolcs2.getCukor()+" ");
        System.out.println();
     */   
        Gyumolcs gyumolcs = new Gyumolcs("Birsalma",20,30);
      /*  System.out.print(gyumolcs3.getNev()+" ");
        System.out.print(gyumolcs3.getKaloriatart()+" ");
        System.out.print(gyumolcs3.getCukor()+" ");
        System.out.println();
      */  
        Gyumolcs gyumolcs = new Gyumolcs("Banan",82,12);
      /*  System.out.print(gyumolcs4.getNev()+" ");
        System.out.print(gyumolcs4.getKaloriatart()+" ");
        System.out.print(gyumolcs4.getCukor()+" ");
      */  System.out.println();
        
        Gyumolcs gyumolcs = new Gyumolcs("Narancs",65,60);
      /*  System.out.print(gyumolcs5.getNev()+" ");
        System.out.print(gyumolcs5.getKaloriatart()+" ");
        System.out.print(gyumolcs5.getCukor()+" ");
       */ System.out.println();
        
        Gyumolcs gyumolcs = new Gyumolcs("Eper",20,600);
      /*  System.out.print(gyumolcs6.getNev()+" ");
        System.out.print(gyumolcs6.getKaloriatart()+" ");
        System.out.print(gyumolcs6.getCukor()+" ");
       */ System.out.println();
        
        Gyumolcs gyumolcs = new Gyumolcs("Kokusz",350,10);
      /*  System.out.print(gyumolcs7.getNev()+" ");
        System.out.print(gyumolcs7.getKaloriatart()+" ");
        System.out.print(gyumolcs7.getCukor()+" ");
        System.out.println();
      */ 
       Gyumolcs gyumolcs = new Gyumolcs("Korte",70,100);
     /*   System.out.print(gyumolcs8.getNev()+" ");
        System.out.print(gyumolcs8.getKaloriatart()+" ");
        System.out.print(gyumolcs8.getCukor()+" ");
        System.out.println();*/
    }
//fail
}
