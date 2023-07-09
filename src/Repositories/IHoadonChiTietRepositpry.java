/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import DomainModels.HoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IHoadonChiTietRepositpry {
    ArrayList<HoaDonChiTiet> selectAll();

    HoaDonChiTiet insert(HoaDonChiTiet hoaDonChiTiet);

    HoaDonChiTiet update(HoaDonChiTiet hoaDonChiTiet);

    String delete(String ma);

    ArrayList<HoaDonChiTiet> selectById(String ma);
    
    ArrayList<HoaDonChiTiet> selectBySql(String sql, Object... args);
}
