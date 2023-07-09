/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.math.BigDecimal;

/**
 *
 * @author LENOVO
 */
public class QlHoaDonChiTiet {
     private String IdHoaDon;
    private Integer soLuong;
    private BigDecimal donGia;

    public QlHoaDonChiTiet() {
    }

    public QlHoaDonChiTiet( Integer soLuong, BigDecimal donGia) {
        
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public QlHoaDonChiTiet(String IdHoaDon, Integer soLuong, BigDecimal donGia) {
        this.IdHoaDon = IdHoaDon;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(String IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }
    
    
}
