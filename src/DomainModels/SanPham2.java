/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

/**
 *
 * @author LENOVO
 */
public class SanPham2 {
    private String id;
    private String tenSanPham;
    private String mieuTa;
    private Double giaBan;
    private int soLuong;

    public SanPham2() {
    }

    public SanPham2(String id, String tenSanPham, String mieuTa, Double giaBan, int soLuong) {
        this.id = id;
        this.tenSanPham = tenSanPham;
        this.mieuTa = mieuTa;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public SanPham2(String id, String mieuTa, Double giaBan, int soLuong) {
        this.id = id;
        this.mieuTa = mieuTa;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getMieuTa() {
        return mieuTa;
    }

    public void setMieuTa(String mieuTa) {
        this.mieuTa = mieuTa;
    }

 

    public Double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(Double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "SanPham2{" + "id=" + id + ", tenSanPham=" + tenSanPham + ", mieuTa=" + mieuTa + ", giaBan=" + giaBan + ", soLuong=" + soLuong + '}';
    }

   
}
