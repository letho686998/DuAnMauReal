/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import java.sql.*;
import DomainModels.HoaDon;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;

public class HoaDonRepository implements IHoaDonRepository {

    final String INSERT_SQL = "insert into HoaDon(Ma,NgayTao,NgayThanhToan,NgayShip,NgayNhan,TinhTrang,TenNguoiNhan,DiaChi,Sdt)\n"
            + "values(?,?,?,?,?,?,?,?,?)";
    final String UPDATE_SQL = "update HoaDon\n"
            + "set NgayTao=?,NgayThanhToan=?,NgayShip=?,NgayNhan=?,TinhTrang=?,TenNguoiNhan=?,DiaChi=?,Sdt=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from HoaDon where Ma=?";
    final String SELECT_BY_SQL = "select * from HoaDon where Ma=?";
    final String SELECT_ALL_SQL = "select HoaDon. Id,KhachHang.Ten as 'TenKh',NhanVien.Ten as 'TenNv',HoaDon.Ma,NgayTao,\n"
            + "NgayThanhToan,NgayShip,NgayNhan,TinhTrang\n"
            + ",TenNguoiNhan,HoaDon. DiaChi,HoaDon.Sdt from HoaDon \n"
            + "join KhachHang on HoaDon.IdKH= KhachHang.Id \n"
            + "join NhanVien on NhanVien.Id= HoaDon.IdNV";

    private ArrayList<HoaDon> _lstHoaDon = new ArrayList<>();
    private IHoaDonRepository _iDonRepository;

    @Override
    public ArrayList<HoaDon> selectAll() {
        _lstHoaDon = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HoaDon insert(HoaDon hoaDon) {
        DBConnection.excuteUpdate(INSERT_SQL, hoaDon.getMa(), hoaDon.getNgayTao(),
                hoaDon.getNgayThanhToan(), hoaDon.getNgayShip(), hoaDon.getNgayNhan(),
                hoaDon.getTinhTrang(), hoaDon.getTenNguoiNhan(),
                hoaDon.getDiaChi(), hoaDon.getSdt());
        return hoaDon;
    }

    @Override
    public HoaDon update(HoaDon hoaDon) {
        DBConnection.excuteUpdate(UPDATE_SQL, hoaDon.getNgayTao(),
                hoaDon.getNgayThanhToan(), hoaDon.getNgayShip(), hoaDon.getNgayNhan(),
                hoaDon.getTinhTrang(), hoaDon.getTenNguoiNhan(),
                hoaDon.getDiaChi(), hoaDon.getSdt(), hoaDon.getMa());
        return hoaDon;
    }

    @Override
    public String delete(String ma) {
        DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
    }

    @Override
    public ArrayList<HoaDon> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDon> selectBySql(String sql, Object... args) {
        ArrayList<HoaDon> __lstHoaDon = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(sql, args);
            while (rs.next()) {
                String id = rs.getString("Id");
                String tenKh = rs.getString("TenKh");
                String tenNv = rs.getString("TenNv");

                String ma = rs.getString("Ma");
                Date ngayTao = rs.getDate("NgayTao");
                Date ngayThanhToan = rs.getDate("NgayThanhToan");
                Date ngayShip = rs.getDate("NgayShip");
                Date ngayNhan = rs.getDate("NgayNhan");
                Integer tinhTrang = rs.getInt("TinhTrang");
                String tenNguoiNhan = rs.getString("TenNguoiNhan");
                String diaChi = rs.getString("DiaChi");
                String sdt = rs.getString("Sdt");
                HoaDon hd = new HoaDon();
                hd.setId(id);
                hd.setMa(ma);
                hd.setNgayTao(ngayTao);
                hd.setNgayThanhToan(ngayThanhToan);
                hd.setNgayShip(ngayShip);
                hd.setNgayNhan(ngayNhan);
                hd.setTinhTrang(tinhTrang);
                hd.setTenNguoiNhan(tenNguoiNhan);
                hd.setDiaChi(diaChi);
                hd.setSdt(sdt);
                _lstHoaDon.add(hd);

            }
        } catch (Exception e) {
        }
        return _lstHoaDon;
    }

}
