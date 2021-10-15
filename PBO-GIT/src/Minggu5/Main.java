/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu5;

import java.util.Scanner;

/**
 *
 * @author Kysuna
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tahu", 1_000, 10);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        
        menu.tampilMenuMakanan();
        
        System.out.print("Pilih makanan : ");
        String namaPesen = in.nextLine();
        boolean cekMakanan = menu.validasiInputanMakanan(namaPesen);
        
        if(cekMakanan == false){
            System.out.println("Nama makanan tidak ada !");
        }
        else{
            System.out.print("Jumlah beli   : ");
            int jmlBeli = in.nextInt();
            boolean cekBeli = menu.cekStok(namaPesen, jmlBeli);
            if(cekBeli == true){
                System.out.println("Jumlah beli melebihi stok !");
            }
            else{
                menu.penguranganStok(namaPesen, jmlBeli);
                menu.tampilMenuMakanan();
            }
        }
    }
}
