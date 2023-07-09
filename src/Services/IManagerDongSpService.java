/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlDongSp;
import ViewModels.QlGioHang;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IManagerDongSpService {
      ArrayList<QlDongSp> selectAllkh();

    QlDongSp insert(QlDongSp qlDongSp);

    QlDongSp update(QlDongSp qlDongSp);

    String delete(String ma);

    ArrayList<QlDongSp> selectById(String ma);
}
