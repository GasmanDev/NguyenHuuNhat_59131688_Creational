/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1;

/**
 *
 * @author Gasman
 */
public class CTHD {
    String sanPham;
    int soLuong;
    double donGia;
    float chietKhau;

    public CTHD() {
    }

    public CTHD(String sanPham, int soLuong, double donGia, float chietKhau) {
        this.sanPham = sanPham;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "Sản phẩm: " + this.sanPham + "\nSố lượng: " + this.soLuong +
                "\nĐơn giá " + this.donGia + "\nChiết khấu: " + this.chietKhau;
    }
    
    public String getSanPham() {
        return sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public float getChietKhau() {
        return chietKhau;
    }

    public void setSanPham(String sanPham) {
        this.sanPham = sanPham;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public void setChietKhau(float chietKhau) {
        this.chietKhau = chietKhau;
    }
    
}
