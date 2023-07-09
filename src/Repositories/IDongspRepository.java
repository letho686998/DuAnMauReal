/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repositories;

import DomainModels.DongSp;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IDongspRepository {
    ArrayList<DongSp> selectAll();

    DongSp insert(DongSp dongSp);

    DongSp update(DongSp dongSp);

    String delete(String ma);

    ArrayList<DongSp> selectById(String ma);

    ArrayList<DongSp> selectBySql(String sql, Object... args);
}
