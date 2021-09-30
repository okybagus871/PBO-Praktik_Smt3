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
public class Soal1 {
    
    public void jawaban(){
        Scanner in = new Scanner(System.in);
        
        int i = 0;
        String str = in.nextLine();
        String splitStr[] = str.split("[!@,.'_\\s]+");
        System.out.println(splitStr.length);
        for(String s : splitStr){
            System.out.println(s);
        }
    }
}
