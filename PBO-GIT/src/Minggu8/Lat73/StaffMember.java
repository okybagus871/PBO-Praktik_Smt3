/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu8.Lat73;

/**
 *
 * @author Kysuna
 */
abstract public class StaffMember {
    protected String name, address, phone;
    
    public StaffMember (String eName, String eAddress, String ePhone){
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    
    public String toString(){
        String result = "Name : " + name + "\n";
        result += "Address : " + address + "\n";
        result += "Phone : " + phone;
        
        return result;
    }
    
    public abstract double pay();
}
