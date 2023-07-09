/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.HoaDon;
import Repositories.HoaDonRepository;
import Repositories.IHoaDonRepository;
import ViewModels.QlHoaDon;
import java.util.ArrayList;

public class ManagerHoaDonService implements IManagerHoaDonService {

    private final IHoaDonRepository _ihDonRepository;
    private ArrayList<QlHoaDon> _lstQlHoaDon;

    public ManagerHoaDonService() {
        _ihDonRepository = new HoaDonRepository();
        _lstQlHoaDon = new ArrayList<>();
    }

    @Override
    public ArrayList<QlHoaDon> selectAllkh() {
        _lstQlHoaDon = new ArrayList<>();
        var x = _ihDonRepository.selectAll();
        for (HoaDon hoaDon : x) {
            _lstQlHoaDon.add(new QlHoaDon(hoaDon.getId(),
                     hoaDon.getMa(),
                    hoaDon.getNgayTao(), hoaDon.getNgayThanhToan(),
                    hoaDon.getNgayShip(), hoaDon.getNgayNhan(), hoaDon.getTinhTrang(), hoaDon.getTenNguoiNhan(),
                    hoaDon.getDiaChi(), hoaDon.getSdt()));

        }
        return _lstQlHoaDon;
    }

    @Override
    public QlHoaDon insert(QlHoaDon qlHoaDon) {
        var x = _ihDonRepository.insert(new HoaDon(qlHoaDon.getMa(), qlHoaDon.getNgayTao(), qlHoaDon.getNgayThanhToan(),
                qlHoaDon.getNgayShip(), qlHoaDon.getNgayNhan(), qlHoaDon.getTinhTrang(), qlHoaDon.getTenNguoiNhan(), qlHoaDon.getDiaChi(), qlHoaDon.getSdt()));
        return new QlHoaDon(x.getMa(), x.getNgayTao(),
                 x.getNgayThanhToan(), x.getNgayShip(), x.getNgayNhan(), x.getTinhTrang(), x.getTenNguoiNhan(), x.getDiaChi(), x.getSdt());
    }

    @Override
    public QlHoaDon update(QlHoaDon qlHoaDon) {
      var x = _ihDonRepository.update(new HoaDon(qlHoaDon.getMa(), qlHoaDon.getNgayTao(), qlHoaDon.getNgayThanhToan(),
                qlHoaDon.getNgayShip(), qlHoaDon.getNgayNhan(), qlHoaDon.getTinhTrang(), qlHoaDon.getTenNguoiNhan(), qlHoaDon.getDiaChi(), qlHoaDon.getSdt()));
        return new QlHoaDon(x.getMa(), x.getNgayTao(),
                 x.getNgayThanhToan(), x.getNgayShip(), x.getNgayNhan(), x.getTinhTrang(), x.getTenNguoiNhan(), x.getDiaChi(), x.getSdt());
     }

    @Override
    public String delete(String ma) {
        _ihDonRepository.delete(ma);
        return ma;
       }

    @Override
    public ArrayList<QlHoaDon> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
