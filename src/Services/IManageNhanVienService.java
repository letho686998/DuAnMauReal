/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;


import ViewModels.QLNhanVien;
import java.util.ArrayList;


public interface IManageNhanVienService {
    ArrayList<QLNhanVien> selectAllkh();

    QLNhanVien insert(QLNhanVien qLNhanVien);

    QLNhanVien update(QLNhanVien qLNhanVien);

    String delete(String ma);

     ArrayList<QLNhanVien> selectById(String ma);
}
