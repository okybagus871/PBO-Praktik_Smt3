/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu9.PaintingShape;

/**
 *
 * @author Kysuna
 */
public class Cylinder extends Shapes {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        return Math.PI * radius * radius * height;
    }

    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }
}
