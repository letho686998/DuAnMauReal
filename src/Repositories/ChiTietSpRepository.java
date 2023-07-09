/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChiTietSanPham;
import Utilities.DBConnection;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class ChiTietSpRepository implements IChiTietSpRepository {

    final String INSERT_SQL = "insert into ChiTietSP(NamBH,MoTa,SoLuongTon,GiaNhap,GiaBan) values(?,?,?,?,?)";
    final String UPDATE_SQL = "update ChiTietSP\n"
            + "set NamBH=?,MoTa=?,SoLuongTon=?,GiaNhap=?,GiaBan=?\n"
            + "where Id=?";
    final String DELETE_SQL = "delete from ChiTietSP where Id=?";
    final String SELECT_BY_SQL = "select * from ChiTietSP where Id=?";
    final String SELECT_ALL_SQL = "select * from ChiTietSP";

    private ArrayList<ChiTietSanPham> _lstChiTietSanPhams = new ArrayList<>();
    private IChiTietSpRepository _icChiTietSpRepository;

    @Override
    public ArrayList<ChiTietSanPham> selectAll() {
        _lstChiTietSanPhams = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChiTietSanPham insert(ChiTietSanPham chiTietSanPham) {
        DBConnection.excuteUpdate(INSERT_SQL, chiTietSanPham.getNamBh(), chiTietSanPham.getMoTa(),
                chiTietSanPham.getSoLuongTon(), chiTietSanPham.getGiaNhap(),
                chiTietSanPham.getGiaBan());
        return chiTietSanPham;
    }

    @Override
    public ChiTietSanPham update(ChiTietSanPham chiTietSanPham) {
        DBConnection.excuteUpdate(INSERT_SQL, chiTietSanPham.getNamBh(), chiTietSanPham.getMoTa(),
                chiTietSanPham.getSoLuongTon(), chiTietSanPham.getGiaNhap(),
                chiTietSanPham.getGiaBan(), chiTietSanPham.getId());
        return chiTietSanPham;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<ChiTietSanPham> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<ChiTietSanPham> selectBySql(String sql, Object... args) {
        ArrayList<ChiTietSanPham> _lstChiTietSanPhams = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("Id");
                Integer namBh = rs.getInt("NamBh");
                String moTa = rs.getString("Mota");
                Integer soLuongTon = rs.getInt("SoLuongTon");
                BigDecimal giaNhap = rs.getBigDecimal("GiaNhap");
                BigDecimal giaBan = rs.getBigDecimal("GiaBan");
                ChiTietSanPham ct = new ChiTietSanPham();
                ct.setId(id);
                ct.setNamBh(namBh);
                ct.setMoTa(moTa);
                ct.setSoLuongTon(soLuongTon);
                ct.setGiaNhap(giaNhap);
                ct.setGiaBan(giaBan);
                _lstChiTietSanPhams.add(ct);
            }
        } catch (Exception e) {
        }
        return _lstChiTietSanPhams;
    }

}
