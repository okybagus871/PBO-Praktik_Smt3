/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minggu2;

import java.util.Scanner;

/**
 *
 * @author Kysuna
 */
public class Main {
    public static void main(String[] args) {
        Scanner inpt = new Scanner(System.in);
        
        //Soal 1
        System.out.print("can be fitted in : ");
        if(inpt.hasNextByte() == true){
            System.out.println("*byte");
        }
        if(inpt.hasNextShort() == true){
            System.out.println("*short");
        }
        if(inpt.hasNextInt() == true){
            System.out.println("*int");
        }
        if(inpt.hasNextLong() == true){
            System.out.println("*long");
        }
        
    }
}
