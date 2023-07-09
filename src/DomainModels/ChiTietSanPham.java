/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.math.BigDecimal;


public class ChiTietSanPham {
    private String Id;
    private String Idsp;
    private String IdNsx;
    private String IdMauSac;
    private String IdDongSp;
    private Integer namBh;
    private String moTa;
    private Integer soLuongTon;
    private BigDecimal giaNhap;
    private BigDecimal giaBan;

    public ChiTietSanPham() {
    }

    public ChiTietSanPham(String Id, String Idsp, String IdNsx, String IdMauSac, String IdDongSp, Integer namBh, String moTa, Integer soLuongTon, BigDecimal giaNhap, BigDecimal giaBan) {
        this.Id = Id;
        this.Idsp = Idsp;
        this.IdNsx = IdNsx;
        this.IdMauSac = IdMauSac;
        this.IdDongSp = IdDongSp;
        this.namBh = namBh;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSanPham(Integer namBh, String moTa, Integer soLuongTon, BigDecimal giaNhap, BigDecimal giaBan) {
        this.namBh = namBh;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public ChiTietSanPham(String Id, Integer namBh, String moTa, Integer soLuongTon, BigDecimal giaNhap, BigDecimal giaBan) {
        this.Id = Id;
        this.namBh = namBh;
        this.moTa = moTa;
        this.soLuongTon = soLuongTon;
        this.giaNhap = giaNhap;
        this.giaBan = giaBan;
    }

    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getIdsp() {
        return Idsp;
    }

    public void setIdsp(String Idsp) {
        this.Idsp = Idsp;
    }

    public String getIdNsx() {
        return IdNsx;
    }

    public void setIdNsx(String IdNsx) {
        this.IdNsx = IdNsx;
    }

    public String getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(String IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    public String getIdDongSp() {
        return IdDongSp;
    }

    public void setIdDongSp(String IdDongSp) {
        this.IdDongSp = IdDongSp;
    }

    public Integer getNamBh() {
        return namBh;
    }

    public void setNamBh(Integer namBh) {
        this.namBh = namBh;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Integer getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(Integer soLuongTon) {
        this.soLuongTon = soLuongTon;
    }

    public BigDecimal getGiaNhap() {
        return giaNhap;
    }

    public void setGiaNhap(BigDecimal giaNhap) {
        this.giaNhap = giaNhap;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return "ChiTietSanPham{" + "Id=" + Id + ", Idsp=" + Idsp + ", IdNsx=" + IdNsx + ", IdMauSac=" + IdMauSac + ", IdDongSp=" + IdDongSp + ", namBh=" + namBh + ", moTa=" + moTa + ", soLuongTon=" + soLuongTon + ", giaNhap=" + giaNhap + ", giaBan=" + giaBan + '}';
    }
    
}
