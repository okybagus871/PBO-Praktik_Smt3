/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu9.PaintingShape;

/**
 *
 * @author Kysuna
 */
public class Rectangle extends Shapes {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public String toString() {
        return super.toString() + " of length " + this.length + " and width " + this.width;
    }
}
