/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import DomainModels.NhanVien;
import java.util.ArrayList;


public interface INhanVienrepository {
    ArrayList<NhanVien> selectAll();

    NhanVien insert(NhanVien nhanVien);

    NhanVien update(NhanVien nhanVien);

    String delete(String ma);

    ArrayList<NhanVien> selectById(String ma);
    
    ArrayList<NhanVien> selectBySql(String sql, Object... args);
}
