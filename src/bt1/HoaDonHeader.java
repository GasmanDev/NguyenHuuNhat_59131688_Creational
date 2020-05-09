/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

import java.util.Date;

/**
 *
 * @author Gasman
 */
public class HoaDonHeader {
    String maHoaDon;
    String tenKhachHang;
    Date ngayBan;

    public HoaDonHeader() {
    }
    public HoaDonHeader(String maHoaDon, String tenKhachHang, Date ngayBan) {
        this.maHoaDon = maHoaDon;
        this.tenKhachHang = tenKhachHang;
        this.ngayBan = ngayBan;
    }

    @Override
    public String toString() {
        return "Mã hóa đơn: " + this.maHoaDon +
                "\nTên khách hàng: " + this.tenKhachHang +
                "\nNgày bán: " + this.ngayBan;//To change body of generated methods, choose Tools | Templates.
    }
    
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public Date getNgayBan() {
        return ngayBan;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void setNgayBan(Date ngayBan) {
        this.ngayBan = ngayBan;
    }
    
    
}
