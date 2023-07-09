/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLCuaHang;
import ViewModels.QlGioHang;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IManagerGioHangService {
    ArrayList<QlGioHang> selectAllkh();

    QlGioHang insert(QlGioHang qlGioHang);

    QlGioHang update(QlGioHang qlGioHang);

    String delete(String ma);

    ArrayList<QlGioHang> selectById(String ma);
}
