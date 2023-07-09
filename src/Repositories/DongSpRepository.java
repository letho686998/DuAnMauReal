/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.DongSp;
import Utilities.DBConnection;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class DongSpRepository implements IDongspRepository {

    final String INSERT_SQL = "insert into DongSP(Ma,Ten) values(?,?)";
    final String UPDATE_SQL = "update DongSP\n"
            + "set Ten=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from DongSP where Ma=?";
    final String SELECT_BY_SQL = "select * from DongSP where Ma=?";
    final String SELECT_ALL_SQL = "select * from DongSP";

    private ArrayList<DongSp> _lstDongsp = new ArrayList<>();
    private IDongspRepository _idDongspRepository;

    @Override
    public ArrayList<DongSp> selectAll() {
        _lstDongsp = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public DongSp insert(DongSp dongSp) {
        DBConnection.excuteUpdate(INSERT_SQL, dongSp.getMa(), dongSp.getTen());
        return dongSp;
    }

    @Override
    public DongSp update(DongSp dongSp) {
        DBConnection.excuteUpdate(UPDATE_SQL, dongSp.getTen(), dongSp.getMa());
        return dongSp;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<DongSp> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<DongSp> selectBySql(String sql, Object... args) {
        ArrayList<DongSp> _lstDongsp = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                DongSp sp = new DongSp();
                sp.setId(id);
                sp.setMa(ma);
                sp.setTen(ten);
                _lstDongsp.add(sp);
            }
        } catch (Exception e) {
        }
        return _lstDongsp;
    }

}
