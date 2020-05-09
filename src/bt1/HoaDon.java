/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.ArrayList;

/**
 *
 * @author Gasman
 */
public class HoaDon {
    ArrayList<CTHD> listCTHD = new ArrayList<>();
    HoaDonHeader hdHeader = new HoaDonHeader();
    protected HoaDon(Builder builder){
        this.hdHeader = builder.hdHeader;
        this.listCTHD = builder.listCTHD;
    }
    String getCTHDStr()
    {
        String str = "";
        for (int i = 0; i < listCTHD.size(); i++)
            str += "(" + (i+1) + ")" + ":" + listCTHD.get(i).toString()+"\n";
        return str;
    }
    @Override
    public String toString() {
        return "------Hóa đơn bán hàng------\n" + hdHeader.toString() 
                + "\nChi tiết hóa đơn: \n" +
                getCTHDStr();  
    }
    
    public static class Builder{
        ArrayList<CTHD> listCTHD = new ArrayList<>();
        HoaDonHeader hdHeader = new HoaDonHeader();

        public Builder() {
        }
        public Builder setHeader(HoaDonHeader hdHeader)
        {
            this.hdHeader = hdHeader;
            return this;
        }
        public Builder addCTHD(CTHD cthd)
        {
            listCTHD.add(cthd);
            return this;
        }
        public HoaDon build()
        {
            return new HoaDon(this);
        }
    }
}
