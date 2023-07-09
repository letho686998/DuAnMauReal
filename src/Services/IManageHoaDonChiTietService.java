/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlHoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IManageHoaDonChiTietService {
    ArrayList<QlHoaDonChiTiet> selectAllkh();

    QlHoaDonChiTiet insert(QlHoaDonChiTiet qlHoaDonChiTiet);

    QlHoaDonChiTiet update(QlHoaDonChiTiet qlHoaDonChiTiet);

    String delete(String ma);

     ArrayList<QlHoaDonChiTiet> selectById(String ma);
}
