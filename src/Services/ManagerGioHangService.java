/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.GioiHang;
import Repositories.GioHangRepository;
import Repositories.IGioiHangRepository;
import ViewModels.QlGioHang;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ManagerGioHangService implements IManagerGioHangService {

    private final IGioiHangRepository _igGioiHangRepository;
    private ArrayList<QlGioHang> _listGioHang;

    public ManagerGioHangService() {
        _igGioiHangRepository = new GioHangRepository();
        _listGioHang = new ArrayList<>();
    }

    @Override
    public ArrayList<QlGioHang> selectAllkh() {
        _listGioHang = new ArrayList<>();
        var x = _igGioiHangRepository.selectAll();
        for (GioiHang gioiHang : x) {
            _listGioHang.add(new QlGioHang(gioiHang.getId(), gioiHang.getIdKh(), gioiHang.getIdNv(), gioiHang.getMa(), gioiHang.getNgayTao(),
                    gioiHang.getNgayThanhToan(), gioiHang.getTenNguoiNhan(),
                    gioiHang.getDiaChi(), gioiHang.getSdt(), gioiHang.getTinhTrang()));

        }
        return _listGioHang;
    }

    @Override
    public QlGioHang insert(QlGioHang qlGioHang) {
        var x = _igGioiHangRepository.insert(new GioiHang(qlGioHang.getMa(), qlGioHang.getNgayTao(), qlGioHang.getNgayThanhToan(), qlGioHang.getTenNguoiNhan(),
                qlGioHang.getDiaChi(), qlGioHang.getSdt(), qlGioHang.getTinhTrang()));
        return new QlGioHang(x.getMa(),
                qlGioHang.getNgayTao(), qlGioHang.getNgayThanhToan(),
                qlGioHang.getTenNguoiNhan(), qlGioHang.getDiaChi(), qlGioHang.getSdt(), qlGioHang.getTinhTrang());
    }

    @Override
    public QlGioHang update(QlGioHang qlGioHang) {
        var x = _igGioiHangRepository.update(new GioiHang(qlGioHang.getMa(), qlGioHang.getNgayTao(), qlGioHang.getNgayThanhToan(), qlGioHang.getTenNguoiNhan(),
                qlGioHang.getDiaChi(), qlGioHang.getSdt(), qlGioHang.getTinhTrang()));
        return new QlGioHang(x.getMa(),
                qlGioHang.getNgayTao(), qlGioHang.getNgayThanhToan(),
                qlGioHang.getTenNguoiNhan(), qlGioHang.getDiaChi(), qlGioHang.getSdt(), qlGioHang.getTinhTrang());
    }

    @Override
    public String delete(String ma) {
        _igGioiHangRepository.delete(ma);
        return ma;
    }

    @Override
    public ArrayList<QlGioHang> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
