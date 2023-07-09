/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLNhanVien;
import ViewModels.QlChiTietSp;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface IManagerChitietSpService {

    ArrayList<QlChiTietSp> selectAllkh();

    QlChiTietSp insert(QlChiTietSp qlChiTietSp);

    QlChiTietSp update(QlChiTietSp qlChiTietSp);

    String delete(String ma);

    ArrayList<QlChiTietSp> selectById(String ma);
}
