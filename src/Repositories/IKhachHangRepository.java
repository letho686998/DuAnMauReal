/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import java.util.ArrayList;

public interface IKhachHangRepository {

     ArrayList<KhachHang> selectAll();

    KhachHang insert(KhachHang khachHang);

    KhachHang update(KhachHang khachHang);

    String delete(String ma);

    ArrayList<KhachHang> selectById(String ma);
    
    ArrayList<KhachHang> selectBySql(String sql, Object... args);

}
