/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.KhachHang;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class KhachHangRepository implements IKhachHangRepository {

    final String INSERT_SQL = "insert into KhachHang(Ma,Ten,NgaySinh,Sdt,DiaChi,ThanhPho,QuocGia,MatKhau) values(?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update KhachHang\n"
            + "set Ten=?,NgaySinh=?,Sdt=?,DiaChi=?,ThanhPho=?,QuocGia=?,MatKhau=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from KhachHang where Ma=?";
    final String SELECT_BY_SQL = "select * from KhachHang where Ma=?";
    final String SELECT_ALL_SQL = "SELECT * FROM KhachHang ";

    private List<KhachHang> _lstKhachHang = new ArrayList<>();
    private IKhachHangRepository _ikhaHangRepository;

//    @Override
//    public KhachHang selectById(String ma) {
//        ArrayList<KhachHang> list = selectBySql(SELECT_BY_SQL, ma);
//        if (list.isEmpty()) {
//            return null;
//        }
//        return list.get(0);
//    }
    @Override
    public KhachHang insert(KhachHang khachHang) {
        DBConnection.excuteUpdate(INSERT_SQL, khachHang.getMa(), khachHang.getTen(),
                new java.sql.Date(khachHang.getNgaySinh().getTime()), khachHang.getSdt(),
                khachHang.getDiaChi(), khachHang.getThanhPho(),
                khachHang.getQuocGia(), khachHang.getMatKhau()
        );
        return khachHang;
    }

    @Override
    public KhachHang update(KhachHang khachHang) {
        DBConnection.excuteUpdate(UPDATE_SQL, khachHang.getTen(),
                khachHang.getNgaySinh(), khachHang.getSdt(),
                khachHang.getDiaChi(), khachHang.getThanhPho(),
                khachHang.getQuocGia(), khachHang.getMatKhau(),
                khachHang.getMa());
        return khachHang;
    }

    @Override
    public ArrayList<KhachHang> selectAll() {
        _lstKhachHang = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ArrayList<KhachHang> selectBySql(String sql, Object... args) {
        ArrayList<KhachHang> lstNhanvien = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setId(rs.getString("Id"));
                kh.setMa(rs.getString("Ma"));
                kh.setTen(rs.getString("Ten"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setSdt(rs.getString("Sdt"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setThanhPho(rs.getString("ThanhPho"));
                kh.setQuocGia(rs.getString("QuocGia"));
                kh.setMatKhau(rs.getString("MatKhau"));
                lstNhanvien.add(kh);
               // rs.close();
                
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return lstNhanvien;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<KhachHang> selectById(String ma) {

        ArrayList<KhachHang> dskh = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(SELECT_BY_SQL, ma);

            while (rs.next()) {
                KhachHang kh = new KhachHang();
                kh.setId(rs.getString("Id"));
                kh.setMa(rs.getString("Ma"));
                kh.setTen(rs.getString("Ten"));
                kh.setNgaySinh(rs.getDate("NgaySinh"));
                kh.setSdt(rs.getString("Sdt"));
                kh.setDiaChi(rs.getString("DiaChi"));
                kh.setThanhPho(rs.getString("ThanhPho"));
                kh.setQuocGia(rs.getString("QuocGia"));
                kh.setMatKhau(rs.getString("MatKhau"));
                dskh.add(kh);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return dskh;
    }

}
