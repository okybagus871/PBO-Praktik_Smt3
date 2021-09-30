/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu3;

import java.util.Scanner;

/**
 *
 * @author Kysuna
 */
public class Soal4 {
    public void jawaban(){
        Scanner in = new Scanner(System.in);
        
        int jmlJual = in.nextInt();
        int gaji;
        
        if(jmlJual >= 40){
            gaji = 500000 + ((jmlJual * 50000) * 25/100);
            System.out.println(gaji);
        }
        else if(jmlJual >= 80){
            gaji = 500000 + ((jmlJual * 50000) * 35/100);
            System.out.println(gaji);
        }
        else if(jmlJual < 15){
            gaji = 500000 - ((50000 * (15 - jmlJual)) * 15/100);
            System.out.println(gaji);
        }
        else{
            gaji = 500000 + ((50000 * 10/100) * jmlJual);
            System.out.println(gaji);
        }
    }
}
