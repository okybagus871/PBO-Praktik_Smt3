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
public class Soal2 {
    public void jawaban(){
        Scanner in = new Scanner(System.in);
        
        int i = 0;
        String inpt;
        String kata[] = new String[3];
        int angka[] = new int[3];
        
        while(i < 3){
            inpt = in.nextLine();
            String val[] = inpt.split(" ");
            kata[i] = val[0];
            angka[i] = Integer.parseInt(val[1]);
            if(kata[i].length() >= 10 || angka[1] >= 999){
                System.out.println("Kata atau angka melebihi limit");
                break;
            }
            i++;
        }
        i = 0;
        System.out.println("==============================");
        while(i < 3){
            System.out.println(String.format("%-15s", kata[i]) + String.format("%03d", angka[i]));
            i++;
        }
        System.out.println("==============================");
    }
}
