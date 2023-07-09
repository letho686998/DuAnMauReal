/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

import java.util.Date;

public class QLNhanVien {

    private String id;
    private String ma;
    private String ten;
    private String gioiTinh;
    private Date ngaySinh;
    private String diaChi;
    private String sdt;
    private String matKhau;
    private String IdCh;
    private String IdCv;
    private String IdGuiBC;
    private Integer trangThai;

    public QLNhanVien() {
    }

    public QLNhanVien(String id, String ma, String ten, String gioiTinh, Date ngaySinh, String diaChi, String sdt, String matKhau, Integer trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public QLNhanVien(String id, String ma, String ten, String gioiTinh, Date ngaySinh, String diaChi, String sdt, String matKhau, String IdCh, String IdCv, String IdGuiBC, Integer trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.IdCh = IdCh;
        this.IdCv = IdCv;
        this.IdGuiBC = IdGuiBC;
        this.trangThai = trangThai;
    }

    public QLNhanVien(String ma, String ten, String gioiTinh, Date ngaySinh, String diaChi, String sdt, String matKhau, Integer trangThai) {

        this.ma = ma;
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.sdt = sdt;
        this.matKhau = matKhau;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getIdCh() {
        return IdCh;
    }

    public void setIdCh(String IdCh) {
        this.IdCh = IdCh;
    }

    public String getIdCv() {
        return IdCv;
    }

    public void setIdCv(String IdCv) {
        this.IdCv = IdCv;
    }

    public String getIdGuiBC() {
        return IdGuiBC;
    }

    public void setIdGuiBC(String IdGuiBC) {
        this.IdGuiBC = IdGuiBC;
    }

    public Integer getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(Integer trangThai) {
        this.trangThai = trangThai;
    }

}
