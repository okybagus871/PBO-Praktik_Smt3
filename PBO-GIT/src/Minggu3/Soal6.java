/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Kysuna
 */
public class Soal6 {
    public void jawaban(){
        Scanner in = new Scanner(System.in);
        
        BigInteger a = in.nextBigInteger();
        BigInteger b = in.nextBigInteger();
        
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
    }
}
