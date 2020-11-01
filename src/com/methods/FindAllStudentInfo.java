package com.methods;

import com.itluma.utils.JdbcUtils;
import java.sql.*;
import java.util.Scanner;

public class FindAllStudentInfo {
    public static String findAllStudentInfo(String[] args) {
        //从键盘中获取sno的值，以查询特定学生的信息
       /* Scanner scan =new Scanner(System.in);
        System.out.println("请输入sno:");
        String sno=scan.next();*/

        try {
            Connection conn = JdbcUtils.getConnection();
            Statement stmt = conn.createStatement();

           // String sql = "select * from student where sno='"+sno+"'";
            String sql = "select * from student ";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                //显示当期行中每一列的数据
                System.out.println(rs.getString("sno") + " " + rs.getString("sname")+" "
                        + rs.getString(  "sex")+" " + rs.getString("bdate") +" "+ rs.getString("height"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}