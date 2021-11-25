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
public class Soal2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        String hex = "";
        System.out.print("Hex : ");
        hex = in.nextLine();
        int val;
        try{
            val = Integer.parseInt(hex, 16);
            System.out.println("Dec : " + val);
        }
        catch(NumberFormatException e){
            System.out.println("Inputan bukan hex");
        }
    }
    
}
