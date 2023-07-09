/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import java.sql.*;
import DomainModels.NhanVien;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;

public class NhanVienRepository implements INhanVienrepository {

    final String INSERT_SQL = "insert into NhanVien(Ma,Ten,GioiTinh,NgaySinh,DiaChi,Sdt,MatKhau,TrangThai)values(?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update NhanVien\n"
            + "set Ten=?,GioiTinh=?,NgaySinh=?,DiaChi=?,Sdt=?,MatKhau=?,TrangThai=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from NhanVien where Ma=?";
    final String SELECT_BY_SQL = "select * from NhanVien where Ma=?";
    final String SELECT_ALL_SQL = "SELECT * FROM NhanVien ";

    private List<NhanVien> _lstNhanVien = new ArrayList<>();
    private INhanVienrepository _INhanVienrepository;

    @Override
    public ArrayList<NhanVien> selectAll() {
        _lstNhanVien = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien insert(NhanVien nhanVien) {
        DBConnection.excuteUpdate(INSERT_SQL, nhanVien.getMa(), nhanVien.getTen(), nhanVien.getGioiTinh(), new java.sql.Date(nhanVien.getNgaySinh().getTime()),
                nhanVien.getDiaChi(), nhanVien.getSdt(), nhanVien.getMatKhau(), nhanVien.getTrangThai());
        return nhanVien;
    }

    @Override
    public NhanVien update(NhanVien nhanVien) {
        DBConnection.excuteUpdate(UPDATE_SQL, nhanVien.getTen(), nhanVien.getGioiTinh(), new java.sql.Date(nhanVien.getNgaySinh().getTime()),
                nhanVien.getDiaChi(), nhanVien.getSdt(), nhanVien.getMatKhau(), nhanVien.getTrangThai(),nhanVien.getMa());
        return nhanVien;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<NhanVien> selectById(String ma) {
        ArrayList<NhanVien> dsnv = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(SELECT_BY_SQL, ma);
            while (rs.next()) {
                String ten = rs.getString("Ten");
                String gioiTinh = rs.getString("GioiTinh");
                Date ngaySinh = rs.getDate("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                String matKhau = rs.getString("MatKhau");
                Integer trangThai = rs.getInt("TrangThai");
                String manv = rs.getString("Ma");
                NhanVien nv = new NhanVien();
                nv.setTen(ten);
                nv.setGioiTinh(gioiTinh);
                nv.setNgaySinh(ngaySinh);
                nv.setDiaChi(diaChi);
                nv.setSdt(sdt);
                nv.setMatKhau(matKhau);
                nv.setTrangThai(trangThai);
                nv.setMa(ma);
                dsnv.add(nv);
            }
        } catch (Exception e) {
        }
        return dsnv;
    }

    @Override
    public ArrayList<NhanVien> selectBySql(String sql, Object... args) {
        ArrayList<NhanVien> _lstNhanVien = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                String gioiTinh = rs.getString("GioiTinh");
                Date ngaySinh = rs.getDate("NgaySinh");
                String diaChi = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                String matKhau = rs.getString("MatKhau");
                String idCh = rs.getString("Idch");
                String idcv = rs.getString("Idcv");
                String idGuiBc = rs.getString("IdGuiBc");

                Integer trangThai = rs.getInt("TrangThai");
                NhanVien nv = new NhanVien();
                nv.setId(id);
                nv.setMa(ma);
                nv.setTen(ten);
                nv.setGioiTinh(gioiTinh);
                nv.setNgaySinh(ngaySinh);
                nv.setDiaChi(diaChi);
                nv.setSdt(sdt);
                nv.setMatKhau(matKhau);
                nv.setIdCh(idCh);
                nv.setIdCv(idcv);
                nv.setIdGuiBC(idGuiBc);
                nv.setTrangThai(trangThai);
                _lstNhanVien.add(nv);
            }

        } catch (Exception e) {
        }
        return _lstNhanVien;
    }

}
