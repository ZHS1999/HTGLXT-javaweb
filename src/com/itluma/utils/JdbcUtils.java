package com.itluma.utils;

import java.sql.*;

public class JdbcUtils {
    //1、加载驱动
    static {
        // static final Properties PROPERTIES =new Properties();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    //2、建立连接
    public static Connection getConnection(){
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/scutcs?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", "123456");
            return conn;
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
    //3、释放资源
    public static void closeAll(Connection conn, Statement stmt, ResultSet rs) {
        try{
            if(rs!=null){
                rs.close();
            }
            if(stmt!=null){
                stmt.close();
            }
            if (conn!=null){
                conn.close();
            }
        }catch (SQLException throwables) {
            throwables.printStackTrace();
        } {

        }
    }
}
