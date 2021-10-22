/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu6;

import java.util.*;

/**
 *
 * @author Kysuna
 */

class Hape{
    public String nama;
    public int harga;
    
    Hape(String nama, int harga){
        this.nama = nama;
        this.harga = harga;
    }
}

class Konter{
    private final List<Hape> hp;
    
    Konter(List<Hape> hp){
        this.hp = hp;
    }
    
    public List<Hape> getTotalHp(){
        return hp;
    }
}

public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Hape hp1 = new Hape("Siaomi", 1000000);
        Hape hp2 = new Hape("Samsul", 2000000);
        Hape hp3 = new Hape("Aipon", 3000000);
        
        List<Hape> hp = new ArrayList<Hape>();
        hp.add(hp1);
        hp.add(hp2);
        hp.add(hp3);
        
        Konter kntr = new Konter(hp);
        
        List<Hape> h = kntr.getTotalHp();
        for(Hape hh : h){
            System.out.println("Merk " + hh.nama + " Harga " + hh.harga);
        }
    }
    
}
