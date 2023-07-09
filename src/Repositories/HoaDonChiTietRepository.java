/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import java.sql.*;
import DomainModels.HoaDonChiTiet;
import Utilities.DBConnection;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class HoaDonChiTietRepository implements IHoadonChiTietRepositpry {

    final String INSERT_SQL = "insert into HoaDonChiTiet(SoLuong,DonGia) values(?,?)";
    final String UPDATE_SQL = "update HoaDonChiTiet\n"
            + "set SoLuong=?,DonGia=?\n"
            + "where IdHoaDon=??";
    final String DELETE_SQL = "delete from HoaDonChiTiet where IdHoaDon=?";
    final String SELECT_BY_SQL = "select * from HoaDonChiTiet where IdHoaDon=?";
    final String SELECT_ALL_SQL = "select * from HoaDonChiTiet";

    private ArrayList<HoaDonChiTiet> _lstHoaDonchiTiet = new ArrayList<>();
    private IHoadonChiTietRepositpry _IHoadonChiTietRepositpry;

    @Override
    public ArrayList<HoaDonChiTiet> selectAll() {
        _lstHoaDonchiTiet = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDonChiTiet insert(HoaDonChiTiet hd) {
        DBConnection.excuteUpdate(INSERT_SQL, hd.getSoLuong(), hd.getDonGia()
        );
        return hd;
    }

    @Override
    public HoaDonChiTiet update(HoaDonChiTiet hd) {
        DBConnection.excuteUpdate(UPDATE_SQL, hd.getSoLuong(), hd.getDonGia(), hd.getIdHoaDon());
        return hd;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<HoaDonChiTiet> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDonChiTiet> selectBySql(String sql, Object... args) {
        ArrayList<HoaDonChiTiet> _lstHoaDonchiTiet = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("IdHoaDon");
                Integer soLuong = rs.getInt("SoLuong");
                BigDecimal donGia = rs.getBigDecimal("DonGia");
                HoaDonChiTiet hd = new HoaDonChiTiet();
                hd.setIdHoaDon(id);
                hd.setSoLuong(soLuong);
                hd.setDonGia(donGia);
                _lstHoaDonchiTiet.add(hd);
            }
        } catch (Exception e) {
        }
        return _lstHoaDonchiTiet;
    }

}
