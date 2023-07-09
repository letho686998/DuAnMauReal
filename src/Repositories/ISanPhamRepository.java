/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.SanPham;
import java.util.ArrayList;


public interface ISanPhamRepository {
     ArrayList<SanPham> selectAll();

    SanPham insert(SanPham sanPham);

    SanPham update(SanPham sanPham);

    String delete(String ma);

    ArrayList<SanPham> selectById(String ma);
    
    ArrayList<SanPham> selectBySql(String sql, Object... args);
}
