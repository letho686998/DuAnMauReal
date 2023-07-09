/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.ChucVu;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ChucVuRepository implements IChucVuRepository {

    final String INSERT_SQL = "insert into ChucVu(Ma,Ten) values(?,?)";
    final String UPDATE_SQL = "update ChucVu\n"
            + "set Ten=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from ChucVu where Ma=?";
    final String SELECT_BY_SQL = "select * from ChucVu where Ma=?";
    final String SELECT_ALL_SQL = "SELECT * FROM ChucVu ";
    private List<ChucVu> _listChucVu = new ArrayList<>();

    @Override
    public ArrayList<ChucVu> selectAll() {
        _listChucVu = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChucVu insert(ChucVu chucVu) {
        DBConnection.excuteUpdate(INSERT_SQL, chucVu.getMa(), chucVu.getTen());
        return chucVu;
    }

    @Override
    public ChucVu update(ChucVu chucVu) {
        DBConnection.excuteUpdate(UPDATE_SQL, chucVu.getTen(), chucVu.getMa());
        return chucVu;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<ChucVu> selectById(String ma) {
        ArrayList<ChucVu> dscv = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(SELECT_BY_SQL, ma);
            while (rs.next()) {
                ChucVu sv = new ChucVu();
                sv.setMa(rs.getString("Ma"));
                sv.setTen(rs.getString("Ten"));
                dscv.add(sv);
            }
        } catch (Exception e) {
        }
        return dscv;
    }

    @Override
    public ArrayList<ChucVu> selectBySql(String sql, Object... args) {
        ArrayList<ChucVu> lstChucVu = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                ChucVu cv = new ChucVu();
                cv.setMa(rs.getString("Ma"));
                cv.setTen(rs.getString("Ten"));
                lstChucVu.add(cv);
            }
            rs.close();
        } catch (Exception e) {

        }
        return lstChucVu;

    }

}
