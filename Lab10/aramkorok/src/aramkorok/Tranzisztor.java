/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aramkorok;

/**
 *
 * @author patti
 */
public class Tranzisztor extends Alkatresz{
           
    private String kod;

    public Tranzisztor(String kod, int ar,int ertek) {
        super(ar,ertek);
        this.kod = kod;
    }

    @Override
    public String toString() {
        return "Tranzisztor{" + "kod=" + kod + '}';
    }
}
