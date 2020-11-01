package com.methods;

import com.itluma.utils.JdbcUtils;

import java.sql.*;
import java.util.Scanner;

public class AddStudentInfo {
    public static void addStudentInfo(String[] args) {
        Scanner scan1=new Scanner(System.in);
        System.out.println("请输入你想添加的学生信息的学号:");
        String sno=scan1.next();

        Scanner scan2=new Scanner(System.in);
        System.out.println("请输入你想添加的学生信息的姓名:");
        String sname=scan2.next();

        Scanner scan3=new Scanner(System.in);
        System.out.println("请输入你想添加的学生信息的性别:");
        String sex=scan3.next();

        Scanner scan4=new Scanner(System.in);
        System.out.println("请输入你想添加的学生信息的出生日期:");
        String bdate=scan4.next();

        Scanner scan5=new Scanner(System.in);
        System.out.println("请输入你想添加的学生信息的身高:");
        String height=scan5.next();

        try{
            Connection conn = JdbcUtils.getConnection();
            Statement stmt = conn.createStatement();

            String sql ="insert into student values('"+sno+"','"+sname+"','"+sex+"',"+bdate+","+height+")";
            int rows=stmt.executeUpdate(sql);
            if(rows>0){
                System.out.println("添加成功");
            }else{
                System.out.println("添加失败");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
