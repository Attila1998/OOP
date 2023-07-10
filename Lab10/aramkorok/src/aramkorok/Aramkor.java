/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aramkorok;

import java.util.ArrayList;

/**
 *
 * @author patti
 */
public class Aramkor {

    ArrayList<Alkatresz> lista = new ArrayList<Alkatresz>();

    public Aramkor() {
    }

    public ArrayList<Alkatresz> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Alkatresz> lista) {
        this.lista = lista;
    }

    public void HozzaAd(Alkatresz x) {
        lista.add(x);
    }

    public void torol(Alkatresz x) {
        lista.remove(x);
    }

    public int elemszam() {
        return lista.size();
    }

     public double  osszar(){
        double ar=0;
        for(Alkatresz el:lista){
            ar+= el.getAr();
        }
        return ar;
    }

    @Override
    public String toString() {
        return "Aramkor{" + "lista=" + lista + '}';
    }

}
