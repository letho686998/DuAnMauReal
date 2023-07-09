/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.CuaHang;
import java.util.ArrayList;


public interface ICuaHangRepository {
    ArrayList<CuaHang> selectAll();

    CuaHang insert(CuaHang cuaHang);

    CuaHang update(CuaHang cuaHang);

    String delete(String ma);

    ArrayList<CuaHang> selectById(String ma);
    
    ArrayList<CuaHang> selectBySql(String sql, Object... args);
}
