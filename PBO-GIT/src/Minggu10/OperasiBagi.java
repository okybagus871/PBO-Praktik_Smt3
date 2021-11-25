/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu10;

/**
 *
 * @author Kysuna
 */
public class OperasiBagi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            System.out.println("Hasil Bagi 10:0 = " + 10/0);
        }
        catch(Exception e){
            System.out.println("Hasil tidak terdefinisi");
        }
    }
    
}
