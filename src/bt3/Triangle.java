/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3;

/**
 *
 * @author Gasman
 */
public class Triangle extends Shape{
    private static Triangle triangle;

    public Triangle() {
    }
    
    public static Triangle Instance()
    {
        if (triangle == null)
            triangle = new Triangle();
        return triangle;
    }
    @Override
    public String draw() {
        return "Draw Triangle" + "Brush: " + brush + "Paper: " + paper + "Frame: " + frame;
    }
}
