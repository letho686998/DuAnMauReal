/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import DomainModels.NSX;
import java.util.ArrayList;

public interface INhaSX {
    ArrayList<NSX> selectAll();

    NSX insert(NSX nsx);

    NSX update(NSX nsx);

    String delete(String ma);

    ArrayList<NSX> selectById(String ma);
    
    ArrayList<NSX> selectBySql(String sql, Object... args);
}
