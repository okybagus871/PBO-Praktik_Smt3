/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu10;

/**
 *
 * @author Kysuna
 */
public class OperasiArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[] = {1,2,3,4,5};
        try{
            for(int i = 0; i <= 6; i++){
                System.out.println(arr[i]);
            }
        }
        catch(Exception e){
            System.out.println("Array nelebihi kapasitas");
        }
    }
    
}
