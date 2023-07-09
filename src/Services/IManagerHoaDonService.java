/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlHoaDon;
import java.util.ArrayList;


public interface IManagerHoaDonService {
    ArrayList<QlHoaDon> selectAllkh();

    QlHoaDon insert(QlHoaDon qlHoaDon);

    QlHoaDon update(QlHoaDon qlHoaDon);

    String delete(String ma);

     ArrayList<QlHoaDon> selectById(String ma);
}
