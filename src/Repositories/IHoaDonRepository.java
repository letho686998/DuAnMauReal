/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IHoaDonRepository {

    ArrayList<HoaDon> selectAll();

    HoaDon insert(HoaDon hoaDon);

    HoaDon update(HoaDon hoaDon);

    String delete(String ma);

    ArrayList<HoaDon> selectById(String ma);

    ArrayList<HoaDon> selectBySql(String sql, Object... args);
}
