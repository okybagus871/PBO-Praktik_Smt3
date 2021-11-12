/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu8.Lat73;

/**
 *
 * @author Kysuna
 */
public class Commission extends Hourly{
    private double totalSales, commissionRate;
    
    public Commission(String eName, String eAddress, String ePhone,String socSecNumber, double rate, double commissionRate){
        super(eName, eAddress, ePhone, socSecNumber, rate);
        this.commissionRate = commissionRate;
    }
    
    public void addSales(double totalSales){
        this.totalSales = totalSales;
    }
    
    public double pay(){
        double payment = super.pay() + (super.pay()*this.commissionRate);
        return payment;
    }
    
    public String toString(){
        String result = super.toString();
        
        result += "\nTotal Sales : " + totalSales;
        
        return result;
    }
}
