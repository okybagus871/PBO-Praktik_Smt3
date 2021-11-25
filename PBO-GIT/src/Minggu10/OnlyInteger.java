/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu10;

import java.util.Scanner;

/**
 *
 * @author Kysuna
 */
public class OnlyInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        int val = 0;
        try{
            System.out.print("Input : ");
            val = in.nextInt();
            System.out.println("Val : " + val);
        }
        catch(Exception e){
            System.out.println("Bukan int");
        }
    }
}
