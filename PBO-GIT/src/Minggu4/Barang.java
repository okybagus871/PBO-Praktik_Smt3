/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu4;

/**
 *
 * @author Kysuna
 */
public class Barang {
    String kode_barang, nama_barang;
    private int stok = 0;
    
    public Barang(String kode, String nama, int stk){
        kode_barang = kode;
        nama_barang = nama;
        tambahStok(stk);
    }

    public int getStok() {
        return stok;
    }
    
    public void tambahStok(int a){
        if(a <= 0){
            System.out.println("Parameter tidak boleh kurang dari 0");
        }
        else{
            this.stok += a;
        }
    }
}
