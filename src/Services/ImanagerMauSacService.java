/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QlMauSac;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public interface ImanagerMauSacService {
    ArrayList<QlMauSac> selectAllkh();

    QlMauSac insert(QlMauSac qlMauSac);

    QlMauSac update(QlMauSac qlMauSac);

    String delete(String ma);

    ArrayList<QlMauSac> selectById(String ma);
}
