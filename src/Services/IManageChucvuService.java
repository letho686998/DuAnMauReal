/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlChucVu;
import java.util.ArrayList;


public interface IManageChucvuService {
    ArrayList<QlChucVu> selectAllkh();

    QlChucVu insert(QlChucVu qlChucVu);

    QlChucVu update(QlChucVu qlChucVu);

    String delete(String ma);

     ArrayList<QlChucVu> selectById(String ma);
}
