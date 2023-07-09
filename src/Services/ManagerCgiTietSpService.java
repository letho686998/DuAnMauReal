/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChiTietSanPham;
import Repositories.ChiTietSpRepository;
import Repositories.IChiTietSpRepository;
import ViewModels.QlChiTietSp;
import java.util.ArrayList;

public class ManagerCgiTietSpService implements IManagerChitietSpService {

    private final IChiTietSpRepository _ichChiTietSpRepository;
    private ArrayList<QlChiTietSp> _lstQlChiTietsp;

    public ManagerCgiTietSpService() {
        _ichChiTietSpRepository = new ChiTietSpRepository();
        _lstQlChiTietsp = new ArrayList<>();
    }

    @Override
    public ArrayList<QlChiTietSp> selectAllkh() {
        _lstQlChiTietsp = new ArrayList<>();
        var x = _ichChiTietSpRepository.selectAll();
        for (ChiTietSanPham ct : x) {
            _lstQlChiTietsp.add(new QlChiTietSp(ct.getId(), ct.getNamBh(),
                    ct.getMoTa(), ct.getSoLuongTon(), ct.getGiaNhap(), ct.getGiaBan()));
        }
        return _lstQlChiTietsp;
    }

    @Override
    public QlChiTietSp insert(QlChiTietSp qlChiTietSp) {
        var x = _ichChiTietSpRepository.insert(new ChiTietSanPham(qlChiTietSp.getNamBh(), qlChiTietSp.getMoTa(),
                qlChiTietSp.getSoLuongTon(), qlChiTietSp.getGiaNhap(), qlChiTietSp.getGiaBan()));
        return new QlChiTietSp(x.getNamBh(), x.getMoTa(), x.getSoLuongTon(), x.getGiaNhap(), x.getGiaBan());
    }

    @Override
    public QlChiTietSp update(QlChiTietSp qlChiTietSp) {
        var x =_ichChiTietSpRepository.update(new ChiTietSanPham(qlChiTietSp.getId(),qlChiTietSp.getNamBh(), qlChiTietSp.getMoTa(), qlChiTietSp.getSoLuongTon(), qlChiTietSp.getGiaNhap(), qlChiTietSp.getGiaBan()));
        return new QlChiTietSp(x.getId(), x.getNamBh(), x.getMoTa(), x.getSoLuongTon(), x.getGiaNhap(),x.getGiaBan());
      }

    @Override
    public String delete(String ma) {
        _ichChiTietSpRepository.delete(ma);
        return ma;
       }

    @Override
    public ArrayList<QlChiTietSp> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
