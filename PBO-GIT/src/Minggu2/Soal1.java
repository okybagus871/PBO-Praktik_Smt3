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
public class Soal1 {
    Scanner in = new Scanner(System.in);
    public void jawabanSoal1(){
        //Soal 1
        System.out.print("can be fitted in : ");
        if(in.hasNextByte() == true){
            System.out.println("*byte");
        }
        if(in.hasNextShort() == true){
            System.out.println("*short");
        }
        if(in.hasNextInt() == true){
            System.out.println("*int");
        }
        if(in.hasNextLong() == true){
            System.out.println("*long");
        }
        else{
            System.out.println("Can't be fitted anywhere");
        }
    }
}
