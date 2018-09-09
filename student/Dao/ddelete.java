package com.Dao;

import java.sql.*;

public class ddelete{
    public int ddelete(student s) {
        Connection connection = null;
        PreparedStatement pstmt = null;
        int rs = -1;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/学生管理系统", "root", "");
            String sql = "delete from student where Sno=?";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1,s.getSno());
            rs = pstmt.executeUpdate();
            if (rs > 0) {
                return 1;
            } else {
                return 0;
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        } finally {
            try {
                if (pstmt != null) pstmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}