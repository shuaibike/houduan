package com.Dao;

import java.sql.*;

public class loginDao {
    public static int login(manager m) {
        int result = -1;
        Connection connection = null;
        PreparedStatement psmp = null;
        ResultSet rs = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/学生管理系统", "root", "");
            String sql = "select count(*) from administrator where Ausername=? and Apassword=?";
            psmp = connection.prepareStatement(sql);
            psmp.setString(1, m.getuname());
            psmp.setString(2, m.getupassword());
            rs = psmp.executeQuery();
            if (rs.next()) {
                result = 1;//rs.getInt(1);
            }
            if (result > 0) {
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
        }finally {
            try{
                if(rs!=null) rs.close();
                if(psmp!=null) psmp.close();
                if(connection!=null) connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
