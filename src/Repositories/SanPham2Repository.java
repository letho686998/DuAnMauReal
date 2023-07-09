/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import DomainModels.SanPham2;
import java.util.ArrayList;
import Utilities.DBConnection;
import java.sql.*;

/**
 *
 * @author LENOVO
 */
public class SanPham2Repository {

    private ArrayList<SanPham2> _lsSp = new ArrayList<>();

    public ArrayList<SanPham2> getListSanPham() {
        String sql = "select ChiTietSP.IdSP, SoLuongTon,GiaBan,MoTa \n"
                + "from ChiTietSP join SanPham on ChiTietSP.IdSP=SanPham.Id";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement statement = con.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                SanPham2 sp = new SanPham2();

                sp.setId(rs.getString("IdSp"));
                sp.setSoLuong(1);
                sp.setGiaBan(rs.getDouble("GiaBan"));
                sp.setMieuTa(rs.getString("MoTa"));
                _lsSp.add(sp);

            }

        } catch (Exception e) {
        }
        return _lsSp;
    }
}
