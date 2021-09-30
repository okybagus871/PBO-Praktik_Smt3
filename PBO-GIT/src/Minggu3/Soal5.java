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
public class Soal5 {
    public void jawaban(){
        Scanner in = new Scanner(System.in);
        
        String str = in.nextLine();
        String val = str.replaceAll("\\s", "");
        
        if((Long.parseLong(val) - 999999) % 5 == 0){
            System.out.println("Berhenti");
        }
        else{
            System.out.println("Jalan");
        }
    }
}
