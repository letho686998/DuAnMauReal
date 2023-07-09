/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {//Lớp này giải quyết kết nối xử lý truy vấn

    private static final String USERNAME = "sa";
    private static final String PASSWORD = "123456";
    private static final String SERVER = "DESKTOP-HT00NFS\\SQLEXPRESS01";
    private static final String PORT = "1433";
    private static final String DATABASE_NAME = "FINALASS_FPOLYSHOP_FA22_SOF205__SOF2041";
    private static final boolean USING_SSL = true;

    private static String CONNECT_STRING;

    static {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            StringBuilder connectStringBuilder = new StringBuilder();
            connectStringBuilder.append("jdbc:sqlserver://")
                    .append(SERVER).append(":").append(PORT).append(";")
                    .append("databaseName=").append(DATABASE_NAME).append(";")
                    .append("user=").append(USERNAME).append(";")
                    .append("password=").append(PASSWORD).append(";");
            if (USING_SSL) {
                connectStringBuilder.append("encrypt=true;trustServerCertificate=true;");
            }
            CONNECT_STRING = connectStringBuilder.toString();
            System.out.println("Connect String có dạng: " + CONNECT_STRING);
        } catch (ClassNotFoundException ex) {
            System.out.println("Không tìm thấy SQLServer Driver");
            System.out.println("Kiểm tra thư viện đã được import vào project hay chưa?");
        }
    }

    public synchronized static Connection getConnection() throws Exception {
        return DriverManager.getConnection(CONNECT_STRING);
    }

    public static void main(String[] args) throws Exception {
        String version = DBConnection.getConnection().getMetaData()
                .getDatabaseProductVersion();
        System.out.println(version);
    }

    public static ResultSet excuteQuery(String sql, Object... args) {
        Connection connection = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnection.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement = connection.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1, args[i]);
            }
            resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return resultSet;
    }

    public static Integer excuteUpdate(String sql, Object... args) {
        Connection connection = null;
        Integer row=0;
        PreparedStatement preparedStatement = null;
        try {
            connection = DBConnection.getConnection();
        } catch (Exception ex) {
            Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            preparedStatement = connection.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                preparedStatement.setObject(i+1, args[i]);
                //ps.setObject(i + 1, args[i]);//Cộng các value sau câu truy vấn
            }
            row = preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return row;
    }
}
