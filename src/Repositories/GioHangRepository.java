/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.GioiHang;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class GioHangRepository implements IGioiHangRepository {

    final String INSERT_SQL = "insert into GioHang(Ma,NgayTao,NgayThanhToan,TenNguoiNhan,DiaChi,Sdt,TinhTrang)values(?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update GioHang\n"
            + "set NgayTao=?,NgayThanhToan=?,TenNguoiNhan=?,DiaChi=?,Sdt=?,TinhTrang=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from GioHang where Ma=?";
    final String SELECT_BY_SQL = "select * from GioHang where Ma=?";
    final String SELECT_ALL_SQL = "select * from GioHang";

    private ArrayList<GioiHang> _lstGioHang = new ArrayList<>();
    private IGioiHangRepository _igiGioiHangRepository;

    @Override
    public ArrayList<GioiHang> selectAll() {
        _lstGioHang = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public GioiHang insert(GioiHang gioiHang) {
        DBConnection.excuteUpdate(INSERT_SQL, gioiHang.getMa(), gioiHang.getNgayTao(),
                gioiHang.getNgayThanhToan(), gioiHang.getTenNguoiNhan(),
                gioiHang.getDiaChi(), gioiHang.getSdt(), gioiHang.getTinhTrang());
        return gioiHang;
    }

    @Override
    public GioiHang update(GioiHang gioiHang) {
        DBConnection.excuteUpdate(UPDATE_SQL, gioiHang.getNgayTao(),
                gioiHang.getNgayThanhToan(), gioiHang.getTenNguoiNhan(),
                gioiHang.getDiaChi(), gioiHang.getSdt(), gioiHang.getTinhTrang(),gioiHang.getMa());
        return gioiHang;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<GioiHang> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<GioiHang> selectBySql(String sql, Object... args) {
        ArrayList<GioiHang> _lstGioHang = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("Id");
                String IdKh = rs.getString("IdKh");
                String idNv = rs.getString("IdNv");
                String ma = rs.getString("Ma");
                Date ngayTao = rs.getDate("NgayTao");
                Date ngayThanhToan = rs.getDate("NgayThanhToan");
                String tenNguoiNhan = rs.getString("TenNguoiNhan");
                String diaChi = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                Integer tinhTrang = rs.getInt("TinhTrang");
                GioiHang gh = new GioiHang();
                gh.setId(id);
                gh.setIdKh(IdKh);
                gh.setIdNv(idNv);
                gh.setMa(ma);
                gh.setNgayTao(ngayTao);
                gh.setNgayThanhToan(ngayThanhToan);
                gh.setTenNguoiNhan(tenNguoiNhan);
                gh.setDiaChi(diaChi);
                gh.setSdt(sdt);
                gh.setTinhTrang(tinhTrang);
                _lstGioHang.add(gh);
            }
        } catch (Exception e) {
        }
        return _lstGioHang;
    }

}
