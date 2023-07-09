/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import java.sql.*;
import DomainModels.SanPham;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;

public class SanPhamRepository implements ISanPhamRepository {

    final String INSERT_SQL = "insert into SanPham(Ma,Ten) values(?,?)";
    final String UPDATE_SQL = "update SanPham\n"
            + "set Ten =?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from SanPham where Ma=?";
    final String SELECT_BY_SQL = "select * from SanPham where Ma=?";
    final String SELECT_ALL_SQL = "SELECT * FROM SanPham ";

    private List<SanPham> _lstSanPham = new ArrayList<>();

    @Override
    public ArrayList<SanPham> selectAll() {
        _lstSanPham = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public SanPham insert(SanPham sanPham) {
        DBConnection.excuteUpdate(INSERT_SQL, sanPham.getMa(), sanPham.getTen());
        return sanPham;
    }

    @Override
    public SanPham update(SanPham sanPham) {
        DBConnection.excuteUpdate(UPDATE_SQL,  sanPham.getMa(),sanPham.getTen());
        return sanPham;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<SanPham> selectById(String masp) {
        ArrayList<SanPham> dssp = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(SELECT_BY_SQL, masp);
            while (rs.next()) {                
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                SanPham sp = new SanPham();
                sp.setMa(ma);
                sp.setTen(ten);
                dssp.add(sp);
            }
        } catch (Exception e) {
        }
        return dssp;
       }

    @Override
    public ArrayList<SanPham> selectBySql(String sql, Object... args) {
        ArrayList<SanPham> _lstSanPham = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                SanPham sp = new SanPham();
                sp.setId(id);
                sp.setMa(ma);
                sp.setTen(ten);
                _lstSanPham.add(sp);

            }
        } catch (Exception e) {
        }
        return _lstSanPham;
    }

}
