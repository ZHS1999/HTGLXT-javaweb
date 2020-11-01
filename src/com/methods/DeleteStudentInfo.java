package com.methods;

import com.itluma.utils.JdbcUtils;

import java.sql.*;

public class DeleteStudentInfo {
    public static void deleteStudentInfo(String[] args) {
        try{
            Connection conn = JdbcUtils.getConnection();
            Statement stmt = conn.createStatement();

            String sql ="delete from student where sname='null'";
            int rows=stmt.executeUpdate(sql);
            if(rows>0){
                System.out.println("删除成功");
            }else{
                System.out.println("删除失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
