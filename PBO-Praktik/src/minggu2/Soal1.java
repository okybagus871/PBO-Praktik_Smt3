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
public class Soal1 {
    Scanner inpt = new Scanner(System.in);
    void jawabanSoal1(){
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
        else{
            System.out.println("Can't be fitted anywhere");
        }
    }
}
