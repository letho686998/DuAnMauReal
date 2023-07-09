/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;


public class GiohangChiTiet {
    private String IdGioiHang;
    private String IdChiTietSp;
    private Integer soLuong;
    private BigDecimal donGia;
    private BigDecimal donGiaKhiGiam;

    public GiohangChiTiet() {
    }

    public GiohangChiTiet(String IdGioiHang, String IdChiTietSp, Integer soLuong, BigDecimal donGia, BigDecimal donGiaKhiGiam) {
        this.IdGioiHang = IdGioiHang;
        this.IdChiTietSp = IdChiTietSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

    public String getIdGioiHang() {
        return IdGioiHang;
    }

    public void setIdGioiHang(String IdGioiHang) {
        this.IdGioiHang = IdGioiHang;
    }

    public String getIdChiTietSp() {
        return IdChiTietSp;
    }

    public void setIdChiTietSp(String IdChiTietSp) {
        this.IdChiTietSp = IdChiTietSp;
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

    public BigDecimal getDonGiaKhiGiam() {
        return donGiaKhiGiam;
    }

    public void setDonGiaKhiGiam(BigDecimal donGiaKhiGiam) {
        this.donGiaKhiGiam = donGiaKhiGiam;
    }

    @Override
    public String toString() {
        return "GiohangChiTiet{" + "IdGioiHang=" + IdGioiHang + ", IdChiTietSp=" + IdChiTietSp + ", soLuong=" + soLuong + ", donGia=" + donGia + ", donGiaKhiGiam=" + donGiaKhiGiam + '}';
    }
    
}
