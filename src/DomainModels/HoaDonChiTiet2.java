/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;


/**
 *
 * @author LENOVO
 */
public class HoaDonChiTiet2 {

    private String IdHoaDon;
    private String masp;
    private Integer soLuong;
    private Double donGia;

    public HoaDonChiTiet2() {
    }

    public HoaDonChiTiet2(String IdHoaDon, String masp, Integer soLuong, Double donGia) {
        this.IdHoaDon = IdHoaDon;
        this.masp = masp;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getIdHoaDon() {
        return IdHoaDon;
    }

    public void setIdHoaDon(String IdHoaDon) {
        this.IdHoaDon = IdHoaDon;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public Integer getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soLuong = soLuong;
    }

    public Double getDonGia() {
        return donGia;
    }

    public void setDonGia(Double donGia) {
        this.donGia = donGia;
    }

    private Double getThanhTien() {
        return soLuong * donGia;
    }
}
