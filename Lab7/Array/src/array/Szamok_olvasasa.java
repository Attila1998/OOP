/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author patti
 */
public class Szamok_olvasasa {
    
    private ArrayList<Double> tomb;
    private int szamokszama;
    
    public Szamok_olvasasa(String f) {
        try {
            File file = new File(f);
            Scanner scanner = new Scanner(file);
            szamokszama = scanner.nextInt();
            tomb = new ArrayList<Double>(szamokszama);
            for (int i = 0; i < szamokszama; i++) {
                Double x = scanner.nextDouble();
                tomb.add(x);
            }
        } catch (Exception ex) {
            System.out.println("Hiba");
        }
    }
    
    public void kiir_szamok() {
        for (Double x : tomb) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
    
    public Double egyik(int i) {
        return tomb.get(i);
    }
    
    public static void main(String[] args) {
        
        Szamok_olvasasa egy = new Szamok_olvasasa("Be.txt");
        egy.kiir_szamok();
        System.out.println(egy.egyik(0));
    }
    
}
