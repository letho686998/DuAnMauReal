/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import ViewModels.QLNsx;
import java.util.ArrayList;


public interface IManagerNSXService {
    ArrayList<QLNsx> selectAllkh();

    QLNsx insert(QLNsx qln);

    QLNsx update(QLNsx qln);

    String delete(String ma);

     ArrayList<QLNsx> selectById(String ma);
}
