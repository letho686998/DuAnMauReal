/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import java.util.ArrayList;


public interface IChucVuRepository {
    ArrayList<ChucVu> selectAll();

    ChucVu insert(ChucVu chucVu);

    ChucVu update(ChucVu chucVu);

    String delete(String ma);

    ArrayList<ChucVu> selectById(String ma);
    
    ArrayList<ChucVu> selectBySql(String sql, Object... args);
}
