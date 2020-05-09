/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Gasman
 */
public class Bt1_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        HoaDonHeader hdHeader = new HoaDonHeader("HD001", "Nguyễn Hữu Nhật", new SimpleDateFormat("dd/MM/yyyy").parse("16/07/2020"));
        HoaDon hd = new HoaDon.Builder().setHeader(hdHeader).
                addCTHD(new CTHD("Macbook", 1, 50000, 10)).
                addCTHD(new CTHD("Mouse Macbook", 1, 2000, 1)).build();
        System.out.println(hd.toString());
    }
    
}
