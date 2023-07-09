/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.CuaHang;
import Utilities.DBConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CuaHangRepository implements ICuaHangRepository {

    final String INSERT_SQL = "insert into CuaHang(Ma,Ten,DiaChi,ThanhPho,QuocGia)values(?,?,?,?,?)";
    final String UPDATE_SQL = "update CuaHang\n"
            + "set Ten=?,DiaChi=?,ThanhPho=?,QuocGia=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from CuaHang where Ma=?";
    final String SELECT_BY_SQL = "select * from CuaHang where Ma=?";
    final String SELECT_ALL_SQL = "SELECT * FROM CuaHang ";

    private List<CuaHang> _lsCuaHangs = new ArrayList<>();
    private ICuaHangRepository _icuCuaHangRepository;

    @Override
    public ArrayList<CuaHang> selectAll() {
        _lsCuaHangs = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public CuaHang insert(CuaHang cuaHang) {
        DBConnection.excuteUpdate(INSERT_SQL, cuaHang.getMa(), cuaHang.getTen(),
                cuaHang.getDiaChi(), cuaHang.getThanhPho(), cuaHang.getQuocGia());
        return cuaHang;
    }

    @Override
    public CuaHang update(CuaHang cuaHang) {
        DBConnection.excuteUpdate(UPDATE_SQL,  cuaHang.getTen(),
                cuaHang.getDiaChi(), cuaHang.getThanhPho(), cuaHang.getQuocGia(),cuaHang.getMa());
        return cuaHang;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<CuaHang> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<CuaHang> selectBySql(String sql, Object... args) {
        ArrayList<CuaHang> _lsCuaHangs = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String diaChi = rs.getString("DiaChi");
                String thanhPho = rs.getString("ThanhPho");
                String quocGia = rs.getString("QuocGia");
                CuaHang ch = new CuaHang();
                ch.setId(id);
                ch.setMa(ma);
                ch.setTen(ten);
                ch.setDiaChi(diaChi);
                ch.setThanhPho(thanhPho);
                ch.setQuocGia(quocGia);
                _lsCuaHangs.add(ch);
            }
        } catch (Exception e) {
        }
        return _lsCuaHangs;
    }

}
