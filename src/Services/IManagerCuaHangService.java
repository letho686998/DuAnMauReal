/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLCuaHang;
import java.util.ArrayList;


public interface IManagerCuaHangService {
    ArrayList<QLCuaHang> selectAllkh();

    QLCuaHang insert(QLCuaHang qLCuaHang);

    QLCuaHang update(QLCuaHang qLCuaHang);

    String delete(String ma);

    ArrayList<QLCuaHang> selectById(String ma);
}
