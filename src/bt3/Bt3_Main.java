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
public class Bt3_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ShapeFactory shape = new ShapeFactory();
        Shape rectangle = shape.createShape(ShapeType.Rectangle);
        rectangle.setBrush("Brush 1");
        rectangle.setPaper("Paper 1");
        rectangle.setFrame("Frame 1");
        System.out.println(rectangle.draw());
        
    }
    
}
