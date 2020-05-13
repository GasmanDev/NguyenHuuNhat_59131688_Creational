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
public class Circle extends Shape{
    private static Circle circle;

    public Circle() {
    }
    
    public static Circle Instance()
    {
        if (circle == null)
            circle = new Circle();
        return circle;
    }
    @Override
    public String draw() {
        return "Draw Circle" + "Brush: " + brush + "Paper: " + paper + "Frame: " + frame;
    }
    
}
