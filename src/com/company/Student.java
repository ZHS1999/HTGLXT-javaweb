package com.company;
/*
* 这是一个学生类，包含学生的相关属性以及设置和获取相关属性值得方法，类无参和有参构造方法
* 其中属性值：学号 姓名 性别 联系电话，家庭地址*/
public class Student {
    //定义学生的相关属性变量
    private String student_id;
    private String student_name;
    private String student_sex;
    private String student_telephone;
    private String student_address;

    public Student(){
    }

    public Student (String student_id,String student_name ,String student_sex ,String student_telephone ,
                    String student_address ){
        this.student_id =student_id;
        this.student_name =student_name;
        this.student_sex =student_sex;
        this.student_telephone =student_telephone ;
        this.student_address=student_address;
    }

    public String getStudent_id(){
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public String getStudent_name(){
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public String getStudent_sex(){
        return student_sex;
    }

    public void setStudent_sex(String student_sex) {
        this.student_sex = student_sex;
    }

    public String getStudent_telephone() {
        return student_telephone;
    }

    public void setStudent_telephone(String student_telephone) {
        this.student_telephone = student_telephone;
    }

    public String getStudent_address(){
        return student_address;
    }

    public void setStudent_address(String student_address) {
        this.student_address = student_address;
    }
}
