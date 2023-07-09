/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import Repositories.HoaDon2Repository;
import Repositories.HoaDonRepository;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class HoaDon2Service {

    private HoaDon2Repository hoaDonRepository = new HoaDon2Repository();

    public Boolean saveHoaDon(HoaDon hoaDon) {
        if (hoaDon.getTinhTrang() == 3) {

        }
        return hoaDonRepository.saveHoaDon(hoaDon);
    }
    public ArrayList<HoaDon> getListHoaDon(){
        return hoaDonRepository.getListHoaDon();
    }
}
