/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlSanPham;
import java.util.ArrayList;

public interface IManagerSanPhamService {

    ArrayList<QlSanPham> selectAllkh();

    QlSanPham insert(QlSanPham qlSanPham);

    QlSanPham update(QlSanPham qlSanPham);

    String delete(String ma);

    ArrayList<QlSanPham> selectById(String ma);
}
