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
public class MyStringBuilder {
    
    String str = "";
    protected MyStringBuilder(Builder builder) {
        this.str = builder.str;
    }

    @Override
    public String toString() {
        return str; //To change body of generated methods, choose Tools | Templates.
    }
       
    public static class Builder{
        String str = "";
        public Builder addString(String s)
        {
            str += s;
            return this;
        }
        public Builder addFloat(float f)
        {
            str += f;
            return this;
        }
        public Builder addBool(boolean b)
        {
            str += b;
            return this;
        }
        public MyStringBuilder build()
        {
            return new MyStringBuilder(this);
        }
    }
}
