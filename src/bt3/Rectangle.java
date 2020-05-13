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
public class Rectangle extends Shape{
    private static Rectangle rectangle;

    public Rectangle() {
    }
    
    public static Rectangle Instance()
    {
        if (rectangle == null)
            rectangle = new Rectangle();
        return rectangle;
    }
    @Override
    public String draw() {
        return "Draw Rectangle" + "Brush: " + brush + "Paper: " + paper + "Frame: " + frame;
    }
    
}
