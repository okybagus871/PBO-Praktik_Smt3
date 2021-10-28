/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu7_2;

/**
 *
 * @author Kysuna
 */
public class Square extends Rectangle {
    Square(){
        super();
    }

    Square(double side){
        super(side, side);
    }

    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide() {
        return getLenght();
    }

    public void setSide(double side) {
        setLenght(side);
        setWidth(side);
    }

    public String toString() {
        return "A Square with side=" + getSide() + ", which is a subclass of\n" + super.toString();
    }
}
