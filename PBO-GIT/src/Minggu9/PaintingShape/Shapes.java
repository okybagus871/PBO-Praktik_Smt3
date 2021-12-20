/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu9.PaintingShape;

/**
 *
 * @author Kysuna
 */
public abstract class Shapes {

    protected String shapeName;
    protected double _area;

    public Shapes(String shapeName) {
        this.shapeName = shapeName;
    }

    public double area() {
        return _area;
    }

    public String toString() {
        return shapeName;
    }

}
