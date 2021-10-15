/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu5;

/**
 *
 * @author Kysuna
 */
public class Restaurant {
    private String namaMakanan[];
    private double hargaMakanan[];
    private int stok[];
    private static byte id=0;
    
    public Restaurant(){
        namaMakanan = new String[10];
        hargaMakanan = new double[10];
        stok = new int[10];
    }
    
    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.namaMakanan[id] = nama;
        this.hargaMakanan[id] = harga;
        this.stok[id] = stok;
    }
    
    public void tampilMenuMakanan(){
        for(int i = 0; i <= id; i++){
            if(stok[i] > 0){
                System.out.println(namaMakanan[i] + "[" + stok[i] + "]" + "\tRp. " + hargaMakanan[i]);
            }
        }
    }
    
    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void nextId(){
        id++;
    }
    
    public void penguranganStok(String nama, int stk){
        for(int i = 0; i <= id; i++){
            if(nama.compareTo(namaMakanan[i]) == 0 && stk < this.stok[i]){
                this.stok[i] -= stk;
                i = 20;
            }
        }
    }
    
    public boolean validasiInputanMakanan(String nama){
        for(int i = 0; i <= id; i++){
            if(nama.compareTo(namaMakanan[i]) == 0){
                return true;
            }
        }
        return false;
    }
    
    public byte cekIdMakanan(String nama){
        for(byte i = 0; i <= id; i++){
            if(nama.compareTo(namaMakanan[i]) == 0){
                return i;
            }
        }
        return 100;
    }
    
    public boolean cekStok(String nama, int beli){
        byte idMakan = cekIdMakanan(nama);
        if(beli > stok[idMakan]){
            return true;
        }
        return false;
    }
}
