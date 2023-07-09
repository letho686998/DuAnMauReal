/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLKhachHang;
import java.util.ArrayList;

public interface IManageKhachHangService {

    ArrayList<QLKhachHang> selectAllkh();

    QLKhachHang insert(QLKhachHang qlkhachHang);

    QLKhachHang update(QLKhachHang qlkhachHang);

    String delete(String ma);

     ArrayList<QLKhachHang> selectById(String ma);
}
