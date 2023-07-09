/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.CuaHang;
import Repositories.CuaHangRepository;
import Repositories.ICuaHangRepository;
import Repositories.INhanVienrepository;
import Repositories.NhanVienRepository;
import java.sql.*;
import ViewModels.QLCuaHang;
import ViewModels.QLNhanVien;
import java.util.ArrayList;

public class ManagerCuaHangService implements IManagerCuaHangService {

    private final ICuaHangRepository _icCuaHangRepository;
    private ArrayList<QLCuaHang> _lstqlCuaHang;

    public ManagerCuaHangService() {
        _icCuaHangRepository = new CuaHangRepository();
        _lstqlCuaHang = new ArrayList<>();
    }

    @Override
    public ArrayList<QLCuaHang> selectAllkh() {
        _lstqlCuaHang = new ArrayList<>();
        var x = _icCuaHangRepository.selectAll();
        for (CuaHang cuaHang : x) {
            _lstqlCuaHang.add(new QLCuaHang(cuaHang.getId(), cuaHang.getMa(), cuaHang.getTen(),
                    cuaHang.getDiaChi(), cuaHang.getThanhPho(), cuaHang.getQuocGia()));
        }
        return _lstqlCuaHang;
    }

    @Override
    public QLCuaHang insert(QLCuaHang qLCuaHang) {
        var x = _icCuaHangRepository.insert(new CuaHang(qLCuaHang.getMa(), qLCuaHang.getTen(),
                qLCuaHang.getDiaChi(), qLCuaHang.getThanhPho(), qLCuaHang.getQuocGia()));
        return new QLCuaHang(x.getMa(), x.getTen(), x.getDiaChi(), x.getThanhPho(), x.getQuocGia());
    }

    @Override
    public QLCuaHang update(QLCuaHang qLCuaHang) {
        var x = _icCuaHangRepository.update(new CuaHang(qLCuaHang.getMa(), qLCuaHang.getTen(),
                qLCuaHang.getDiaChi(), qLCuaHang.getThanhPho(), qLCuaHang.getQuocGia()));
        return new QLCuaHang(x.getMa(), x.getTen(), x.getDiaChi(), x.getThanhPho(), x.getQuocGia());

    }

    @Override
    public String delete(String ma) {
        _icCuaHangRepository.delete(ma);
        return ma;
    }

    @Override
    public ArrayList<QLCuaHang> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
