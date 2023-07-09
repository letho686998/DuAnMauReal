/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import java.sql.*;
import DomainModels.Mausac;
import Utilities.DBConnection;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class MauSacRepository implements IMauSacRepository {

    final String INSERT_SQL = "insert into MauSac(Ma,Ten) values(?,?)";
    final String UPDATE_SQL = "update MauSac\n"
            + "set Ten=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from MauSac where Ma=?";
    final String SELECT_BY_SQL = "select * from MauSac where Ma=?";
    final String SELECT_ALL_SQL = "select * from MauSac";

    private ArrayList<Mausac> _lstMauSac = new ArrayList<>();
    private IMauSacRepository _imIMauSacRepository;

    @Override
    public ArrayList<Mausac> selectAll() {
        _lstMauSac = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public Mausac insert(Mausac mausac) {
        DBConnection.excuteUpdate(INSERT_SQL, mausac.getMa(), mausac.getTen());
        return mausac;
    }

    @Override
    public Mausac update(Mausac mausac) {
        DBConnection.excuteUpdate(UPDATE_SQL, mausac.getTen(),mausac.getMa());
        return mausac;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
       }

    @Override
    public ArrayList<Mausac> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<Mausac> selectBySql(String sql, Object... args) {
        ArrayList<Mausac> _lstMauSac = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                Mausac ms = new Mausac();
                ms.setId(id);
                ms.setMa(ma);
                ms.setTen(ten);
                _lstMauSac.add(ms);
            }
        } catch (Exception e) {
        }
        return _lstMauSac;
    }

}
