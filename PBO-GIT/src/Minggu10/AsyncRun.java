/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Minggu10;

/**
 *
 * @author Kysuna
 */
public class AsyncRun implements Runnable{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Thread t = new Thread(new AsyncRun());
            t.start();
            System.out.println("main on board " + Thread.currentThread().getId());
            throw new NullPointerException();
        }
        catch(Exception ex){
            System.out.println(ex.getClass().getName() + "Handled");
        }
    }

    @Override
    public void run() {
        try{
            System.out.println("AsyncRun.run on thread " + Thread.currentThread().getId());
            throw new ArithmeticException();
        }
        catch(Exception e){
            System.out.println(e.getClass().getName() + "Handled");
        }
    }
}
