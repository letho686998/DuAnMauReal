/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.GioiHang;
import java.util.ArrayList;

public interface IGioiHangRepository {

    ArrayList<GioiHang> selectAll();

    GioiHang insert(GioiHang gioiHang);

    GioiHang update(GioiHang gioiHang);

    String delete(String ma);

    ArrayList<GioiHang> selectById(String ma);

    ArrayList<GioiHang> selectBySql(String sql, Object... args);
}
