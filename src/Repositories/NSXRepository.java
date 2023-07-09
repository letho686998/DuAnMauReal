/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repositories;

import java.sql.*;
import DomainModels.NSX;
import Utilities.DBConnection;
import java.util.ArrayList;
import java.util.List;

public class NSXRepository implements INhaSX {

    final String INSERT_SQL = "insert into NSX(Ma,Ten)values(?,?)";
    final String UPDATE_SQL = "update NSX\n"
            + "set Ten=?\n"
            + "where Ma=?";
    final String DELETE_SQL = "delete from NSX where Ma=?";
    final String SELECT_BY_SQL = "select * from NSX where Ma=?";
    final String SELECT_ALL_SQL = "SELECT * FROM NSX ";

    private List<NSX> _lsNsx = new ArrayList<>();
    private INhaSX _inINhaSX;

    @Override
    public ArrayList<NSX> selectAll() {
        _lsNsx= new ArrayList<>();
        return selectBySql(SELECT_ALL_SQL);
     }

    @Override
    public NSX insert(NSX nsx) {
         DBConnection.excuteUpdate(INSERT_SQL, nsx.getMa(),nsx.getTen());
        return nsx;
        }

    @Override
    public NSX update(NSX nsx) {
        DBConnection.excuteUpdate(UPDATE_SQL,nsx.getMa(), nsx.getTen());
        return nsx;
        }

    @Override
    public String delete(String ma) {
         DBConnection.excuteUpdate(DELETE_SQL, ma);
        return ma;
      }

    @Override
    public ArrayList<NSX> selectById(String ma) {
        ArrayList<NSX> dsnsx = new ArrayList<>();
        try {
            ResultSet rs = DBConnection.excuteQuery(SELECT_BY_SQL, ma);
            while (rs.next()) {                
                String id = rs.getString("Id");
                String mansx = rs.getString("Ma");
                String ten = rs.getString("Ten");
                NSX nsx = new NSX();
                nsx.setId(id);
                nsx.setMa(mansx);
                nsx.setTen(ten);
                dsnsx.add(nsx);
            }
        } catch (Exception e) {
        }
        return dsnsx;
       }

    @Override
    public ArrayList<NSX> selectBySql(String sql, Object... args) {
       ArrayList<NSX> _lsNsx= new ArrayList<>();
        try {
          ResultSet rs= DBConnection.excuteQuery(sql, args);
            while (rs.next()) {                
                String id = rs.getString("Id");
                String ma = rs.getString("Ma");
                String ten = rs.getString("Ten");
                NSX nsx = new NSX();
                nsx.setId(id);
                nsx.setMa(ma);
                nsx.setTen(ten);
                _lsNsx.add(nsx);
            }
        } catch (Exception e) {
        }
        return _lsNsx;
    }

}
