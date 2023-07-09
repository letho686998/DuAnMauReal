/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import DomainModels.HoaDon2;
import DomainModels.KhachHang;
import DomainModels.NhanVien;
import Utilities.DBConnection;
import java.sql.Date;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class HOADONREPO implements IHOADONREPO {

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
    final String SELECT_TENKh = "select Id,Ten from KhachHang";
    final String SELECT_TENHD = "select Id,Ten from NhanVien";
    private ArrayList<HoaDon2> _lstHoaDon = new ArrayList<>();
    private IHoaDonRepository _iDonRepository;

    @Override
    public ArrayList<HoaDon2> selectAll() {
        _lstHoaDon = new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
      }

    @Override
    public HoaDon2 insert(HoaDon2 hoaDon2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDon2 update(HoaDon2 hoaDon2) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDon2> selectById(String ma) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<HoaDon2> selectBySql(String sql, Object... args) {
        ArrayList<HoaDon2> __lstHoaDon = new ArrayList<>();
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
                HoaDon2 hd = new HoaDon2();
                hd.setId(id);
                KhachHang kh = new KhachHang();
                kh.setId(id);
                kh.setTen(tenNv);
                hd.setIdKh(kh);
                
                NhanVien nv = new NhanVien();
                nv.setId(id);
                nv.setTen(tenNv);
                hd.setIdNv(nv);
                
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

    @Override
    public ArrayList<KhachHang> selectNameKh() {
        ArrayList<KhachHang> ds = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(SELECT_TENKh);
            while (rs.next()) {
                String id = rs.getString("Id");
                String ten = rs.getString("Ten");
                KhachHang kh = new KhachHang();
                kh.setId(id);
                kh.setTen(ten);
                ds.add(kh);
                return ds;
            }
        } catch (Exception e) {
        }
        return null;
    }

    @Override
    public ArrayList<NhanVien> selectNameNv() {
         ArrayList<NhanVien> ds = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(SELECT_TENHD);
            while (rs.next()) {
                String id = rs.getString("Id");
                String ten = rs.getString("Ten");
                NhanVien kh = new NhanVien();
                kh.setId(id);
                kh.setTen(ten);
                ds.add(kh);
                return ds;
            }
        } catch (Exception e) {
        }
        return null;
       }

}
