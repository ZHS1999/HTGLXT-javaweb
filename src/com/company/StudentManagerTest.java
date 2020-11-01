package com.company;
import com.methods.AddStudentInfo;
import com.methods.DeleteStudentInfo;
import com.methods.FindAllStudentInfo;
import com.methods.UpdateStudentInfo;

import java.util.ArrayList;
import java.util.Scanner;
 /*
 * 这是一个学生管理系统的主体类
 * 开发过程：
 *   1、编写学生类
 *   2、编写学生管理系统的菜单
 *   3、编写查询所有学生信息的方法
 *   4、编写添加学生信息的方法，其中要保证学生的学号唯一
 *   5、编写删除学生信息的方法
 *   6、编写修改学生相关信息的方法
 */
public class StudentManagerTest {
     public static void main(String[] args) {
         //创建集合对象
         ArrayList<Student> array =new ArrayList<Student>();
         while(true){
             //菜单
             System.out.println("-------------欢迎进入学生管理系统--------------");
             System.out.println("请选择相关选项对学生信息进行管理...\n");
             System.out.println("1、查看学生所有信息");
             System.out.println("2、添加学上信息");
             System.out.println("3、删除学生信息");
             System.out.println("4、修改学生信息");
             System.out.println("5、退出系统\n");
             //创建键盘录入对象
             Scanner sc = new Scanner(System.in);
             //接受选项数据
             System.out.println("请输入你的选项");
             String option = sc.nextLine();
             switch (option) {
                 //查看所有学生信息
                 case "1":
                     FindAllStudentInfo.findAllStudentInfo(null);
                     break;
                 case "2":
                     AddStudentInfo.addStudentInfo(null);
                     break;
                 //删除学生信息
                 case "3":
                     DeleteStudentInfo.deleteStudentInfo(null);
                     break;
                 case "4":
                     UpdateStudentInfo.updateStudentInfo(null);
                     break;
                 //退出系统
                 case "5":
                     System.out.println("退出系统成功！");
                     //关闭Java虚拟机
                     System.exit(0);
                     break;
                 //输入错误
                 default:
                     System.out.println("\n输入错误，请重新选择！\n");
                     break;
             }
         }
     }
     /*//查询所有学生信息
     public static void findAllStudentInfo(ArrayList<Student> array){
         //查询功能
         if(array.size() ==0){
             System.out.println("\n系统中没有学生信息，请先选择\"添加\"选项，添加学生。\n");
             return;
         }
         System.out.println();
         System.out.println("-------------欢迎查看所有学生信息--------------");
         System.out.println("学号\t\t姓名\t性别\t联系电话\t\t家庭地址");
         for(int i=0;i<array.size();i++){
             Student s=array.get(i);
             if (i != array.size() - 1)
                 System.out.println(s.getStudent_id()+"\t"+s.getStudent_name()+"\t"+s.getStudent_sex()+"\t"
                 +s.getStudent_telephone()+"\t"+s.getStudent_address());
             else
                 System.out.println(s.getStudent_id()+"\t"+s.getStudent_name()+"\t"+s.getStudent_sex()+"\t"
                         +s.getStudent_telephone()+"\t"+s.getStudent_address()+"\n");
         }

     }
     //添加学生信息
     public static void addStudentInfo(ArrayList<Student> array) {
         //创建键盘录入对象
         Scanner sc=new Scanner(System.in);
         String student_id;
         System.out.println();
         while (true){
             //请输入学生信息
             System.out.print("请输入学号：");
             student_id = sc.nextLine();
             //定义标记
             boolean flag = false;
             //判断学号是否已存在
             for (int i=0;i<array.size();i++){
                 Student s=array.get(i);
                 if(s.getStudent_id().equals(student_id)){
                     flag = true;
                     break;
                 }
             }
             if (flag)
                 System.out.print("你输入的学号已存在，请重新输入！\n");
             else
                 break;

         }
         System.out.print("请输入姓名:");
         String student_name=sc.nextLine();
         System.out.print("请输入性别:");
         String student_sex=sc.nextLine();
         System.out.print("请输入联系方式：");
         String student_telephone=sc.nextLine();
         System.out.print("请输入家庭地址：");
         String student_address=sc.nextLine();
         //创建学生对象
         Student s = new Student();
         s.setStudent_id(student_id);
         s.setStudent_name(student_name);
         s.setStudent_sex(student_sex);
         s.setStudent_telephone(student_telephone);
         s.setStudent_address(student_address);
         //把学生对象作为元素添加到集合中
         array.add(s);
         //输出提示信息
         System.out.println("\n添加成功\n");
     }
     //删除学生信息
     public static void deleteStudentInfo(ArrayList<Student> array){
         //创建键盘录入对象
         Scanner sc=new Scanner(System.in);
         //输入要删除学生的学号
         System.out.println();
         System.out.print("请输入你要删除学生的学号：");
         String student_id = sc.nextLine();
         //定义标记
         int index=-1;
         //查询用户输入的学号是否存在
         Student s=null;

         for (int i=0;i <array.size(); i++){
             s=array.get(i);
             if (s.getStudent_id().equals(student_id)){
                 index=i;
                 break;
             }
         }
         if(index == -1)
             System.out.println("\n没有查找到你所输入的学号，请检查学号是否输入正确\n");
         else
         {
             System.out.println("\n你要删除的学号对应的信息如下，是否删除？\n输入\"1\"选择\"是\"，输入任意键选择\"否\"");
             System.out.println("学号\t\t姓名\t性别\t联系电话\t\t家庭住址");
             System.out.println(s.getStudent_id()+"\t"+s.getStudent_name()+"\t"+s.getStudent_sex()+"\t"
                     +s.getStudent_telephone()+"\t"+s.getStudent_address()+"\n");
             System.out.print("请输入：");
             String j = sc.nextLine();
             switch(j){
                 case "1":
                     array.remove(index);
                     System.out.println("\n删除学号为：“+student_id +”的学生成功\n");
                     break;
                 default:
                     System.out.println("\n删除学号为："+student_id+"的学生失败\n");
                     break;
             }
         }

     }
     //更改学生的相关信息
     public static void updateStudentInfo(ArrayList<Student> array){
         //创建键盘录入对象
         Scanner sc=new Scanner(System.in);
         //输入要修改学生的学号
         System.out.println();
         System.out.print("请输入你要修改的学生的学号：");
         String student_id = sc.nextLine();
         //定义标记
         int index=-1;
         //查询用户输入的学号是否存在
         Student s=null;

         for (int i=0;i <array.size(); i++){
             s=array.get(i);
             if (s.getStudent_id().equals(student_id)){
                 index=i;
                 break;
             }
         }
         if(index == -1)
             System.out.println("\n没有查找到你所输入的学号，请检查学号是否输入正确\n");
         else
         {
             System.out.println("\n你要修改的学号对应的信息如下，是否删除？\n输入\"1\"选择\"是\"，输入任意键选择\"否\"");
             System.out.println("学号\t\t姓名\t性别\t联系电话\t\t家庭住址");
             System.out.println(s.getStudent_id()+"\t"+s.getStudent_name()+"\t"+s.getStudent_sex()+"\t"
                     +s.getStudent_telephone()+"\t"+s.getStudent_address()+"\n");
             System.out.print("请输入：");
             String j = sc.nextLine();
             switch(j){
                 case "1":
                     System.out.println();
                     System.out.print("请输入新姓名：");
                     String student_name = sc.nextLine();
                     System.out.print("请输入新性别：");
                     String student_sex = sc.nextLine();
                     System.out.print("请输入新联系方式");
                     String student_telephone = sc.nextLine();
                     System.out.print("请输入新地址");
                     String student_address = sc.nextLine();
                     //修改集合中的学生的信息
                     s.setStudent_name(student_name);
                     s.setStudent_sex(student_sex);
                     s.setStudent_telephone(student_telephone);
                     s.setStudent_address(student_address);
                     System.out.println("\n学号为：“+student_id +”的学生信息修改成功\n");
                     break;
                 default:
                     System.out.println("\n学号为："+student_id+"的学生信息修改失败\n");
                     break;
             }
         }
     }*/
}
