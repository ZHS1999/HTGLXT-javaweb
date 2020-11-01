package com.methods;

import com.itluma.utils.JdbcUtils;

import java.sql.*;
import java.util.Scanner;

public class UpdateStudentInfo {
    public static void updateStudentInfo(String[] args) {
        Scanner scan1 =new Scanner(System.in);
        System.out.println("请输入你想修改的学生姓名:");
        String sname=scan1.next();

        Scanner scan3=new Scanner(System.in);
        System.out.println("请输入你想添加的学生信息的姓名:");
        String sname1=scan3.next();
        try{
            Connection conn = JdbcUtils.getConnection();
            Statement stmt = conn.createStatement();

            String sql ="update student set sname='"+sname1+"' where sname='"+sname+"'";
            int rows=stmt.executeUpdate(sql);
            if(rows>0){
                System.out.println("修改成功");
            }else{
                System.out.println("修改失败");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
