/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu2;

import java.util.Scanner;

/**
 *
 * @author Kysuna
 */
public class Soal5 {
    void jawabanSoal5(){
        Scanner in = new Scanner(System.in);
        String kataAwal, kataAkhir;
        
        kataAwal = in.nextLine();
        kataAkhir = in.nextLine();
        
        System.out.println(kataAwal.length() + kataAkhir.length());
        
        if(kataAwal.compareTo(kataAkhir) < kataAkhir.compareTo(kataAwal)){
            System.out.println("No");
        }
        System.out.println(kataAwal.substring(0, 1).toUpperCase() + kataAwal.substring(1) + ""
                + " " + kataAkhir.substring(0, 1).toUpperCase() + kataAkhir.substring(1));
    }
}
