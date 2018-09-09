package com.Dao;

import java.sql.*;

public class dsearch {
    public int dsearch(student s) {
        int result=-1;
        Connection connection = null;
        PreparedStatement pstmt = null;
        ResultSet rs =null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/学生管理系统", "root", "");
            String sql = "search count(*) from student where Sname=? or Sno=?";
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, s.getName());
            pstmt.setString(4, s.getSno());
            rs=pstmt.executeQuery();
            if(rs.next()){
                result=rs.getInt(1);
            }
            if (result>0) {
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
                if(rs!=null) rs.close();
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