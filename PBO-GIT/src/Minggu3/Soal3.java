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
public class Soal3 {
    public void jawaban(){
        Scanner in = new Scanner(System.in);
        
        int a, b;
        String str;
        str = in.nextLine();
        String val[] = str.split(" ");
        a = Integer.parseInt(val[0]);
        b = Integer.parseInt(val[2]);
        
        if(a >= 1 && a <= 1000 && b >= 1 && b <= 1000){
            switch(val[1]){
                case "+":
                    System.out.println(a + b);
                    break;
                case "-":
                    System.out.println(a - b);
                    break;
                case "*":
                    System.out.println(a * b);
                    break;
                case "%":
                    System.out.println(a % b);
                    break;
                case "/":
                    System.out.println(a / b);
                    break;
                default:
                    System.out.println("Operator salah");
                    break;
            }
        }
        else{
            System.out.println("Angka melebihi limit");
        }
    }
}
