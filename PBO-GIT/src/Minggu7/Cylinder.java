/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu7;

/**
 *
 * @author Kysuna
 */
public class Cylinder extends Circle {
    private double height;
    
    public Cylinder(){
        super();
        height = 1.0;
    }
    
    public Cylinder(double height){
        super();
        this.height = height;
    }
    
    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    
    public double getHeight(){
        return height;
    }
    
    public double getVolume(){
        return super.getArea()*height;
    }
    
    public double getArea(){
        return super.getArea() + (2*Math.PI*getRadius()*height);
    }
    
    public String toString() {
        return "Cylinder: subclass from" + super.toString()
            + " height = " + height;
    }
}
