/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2;

/**
 *
 * @author Gasman
 */
public class Bt2_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder str = new MyStringBuilder.Builder().addString("ABC").
                addFloat((float) 16.7).addBool(true).build();
        System.err.println(str.toString());
    }
    
}
