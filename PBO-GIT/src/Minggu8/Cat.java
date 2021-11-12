/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu8;

/**
 *
 * @author Kysuna
 */
public class Cat extends Animal{
    
    //@Override
    public void sound(){
        System.out.println("Meow");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal obj = new Cat();
        obj.sound();
    }
    
}
