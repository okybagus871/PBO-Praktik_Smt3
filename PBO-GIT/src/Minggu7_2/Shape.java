/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Minggu7_2;

/**
 *
 * @author Kysuna
 */
public class Shape {
    private String color;
    private boolean filled;

    Shape(){
        color = "red";
        filled = true;
    }

    Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        if(isFilled())
            return "A Shape with color of " + getColor() + "and Filled"	;
        else
            return "A Shape with color of " + getColor() + "and Not Filled"	;
    }
}
