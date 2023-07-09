/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.GioiHang;
import DomainModels.HoaDon2;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IHOADONREPO {

    ArrayList<HoaDon2> selectAll();

    HoaDon2 insert(HoaDon2 hoaDon2);

    HoaDon2 update(HoaDon2 hoaDon2);

    String delete(String ma);

    ArrayList<HoaDon2> selectById(String ma);

    ArrayList<HoaDon2> selectBySql(String sql, Object... args);

    ArrayList<KhachHang> selectNameKh();

    ArrayList<NhanVien> selectNameNv();

}
