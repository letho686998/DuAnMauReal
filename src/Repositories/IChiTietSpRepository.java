/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSanPham;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IChiTietSpRepository {
    ArrayList<ChiTietSanPham> selectAll();

    ChiTietSanPham insert(ChiTietSanPham chiTietSanPham);

    ChiTietSanPham update(ChiTietSanPham chiTietSanPham);

    String delete(String ma);

    ArrayList<ChiTietSanPham> selectById(String ma);
    
    ArrayList<ChiTietSanPham> selectBySql(String sql, Object... args);
}
