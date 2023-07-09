/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.HoaDonChiTiet;
import Repositories.HoaDonChiTietRepository;
import Repositories.IHoadonChiTietRepositpry;
import ViewModels.QlHoaDonChiTiet;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class ManageHoaDonChiTietService implements IManageHoaDonChiTietService {

    private final IHoadonChiTietRepositpry _ihoaChiTietRepositpry;
    private ArrayList<QlHoaDonChiTiet> _lstQlHoaDonchiTiet;

    public ManageHoaDonChiTietService() {
        _ihoaChiTietRepositpry = new HoaDonChiTietRepository();
        _lstQlHoaDonchiTiet = new ArrayList<>();
    }

    @Override
    public ArrayList<QlHoaDonChiTiet> selectAllkh() {
        _lstQlHoaDonchiTiet = new ArrayList<>();
        var x = _ihoaChiTietRepositpry.selectAll();
        for (HoaDonChiTiet hd : x) {
            _lstQlHoaDonchiTiet.add(new QlHoaDonChiTiet(hd.getIdHoaDon(), hd.getSoLuong(), hd.getDonGia()));
        }
        return _lstQlHoaDonchiTiet;
    }

    @Override
    public QlHoaDonChiTiet insert(QlHoaDonChiTiet qlHoaDonChiTiet) {
        var x = _ihoaChiTietRepositpry.insert(new HoaDonChiTiet(qlHoaDonChiTiet.getSoLuong(), qlHoaDonChiTiet.getDonGia()));
        return new QlHoaDonChiTiet(x.getSoLuong(), x.getDonGia());
    }

    @Override
    public QlHoaDonChiTiet update(QlHoaDonChiTiet qlHoaDonChiTiet) {
        var x = _ihoaChiTietRepositpry.insert(new HoaDonChiTiet(qlHoaDonChiTiet.getSoLuong(), qlHoaDonChiTiet.getDonGia()));
        return new QlHoaDonChiTiet(x.getSoLuong(), x.getDonGia());

    }

    @Override
    public String delete(String ma) {
        _ihoaChiTietRepositpry.delete(ma);
        return ma;
    }

    @Override
    public ArrayList<QlHoaDonChiTiet> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
