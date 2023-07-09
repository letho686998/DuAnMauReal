/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.CuaHang;
import DomainModels.Mausac;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IMauSacRepository {
    ArrayList<Mausac> selectAll();

    Mausac insert(Mausac mausac);

    Mausac update(Mausac mausac);

    String delete(String ma);

    ArrayList<Mausac> selectById(String ma);
    
    ArrayList<Mausac> selectBySql(String sql, Object... args);
}
