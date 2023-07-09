/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.HoaDon;
import DomainModels.SanPham2;
import Utilities.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class HoaDon2Repository {

    private ArrayList<HoaDon> _lsHD = new ArrayList<>();

    public Boolean saveHoaDon(HoaDon hoaDon) {
        int check = 0;
        String sql = "insert into HoaDon(Ma,NgayTao,TinhTrang) values(?,?,?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setObject(1, hoaDon.getMa());
            statement.setObject(2, hoaDon.getNgayTao());
            statement.setObject(3, hoaDon.getTinhTrang());
            check = statement.executeUpdate();
            return check > 0;

        } catch (Exception e) {
        }
        return null;
    }

    public ArrayList<HoaDon> getListHoaDon() {
        String sql = "select * from HoaDon";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                HoaDon hoaDon = new HoaDon();
                hoaDon.setId(rs.getString("Id"));
                hoaDon.setNgayTao(rs.getDate("NgayTao"));
                hoaDon.setTinhTrang(rs.getInt("TinhTrang"));
                _lsHD.add(hoaDon);

            }
        } catch (Exception e) {
        }
        return _lsHD;
    }
}
