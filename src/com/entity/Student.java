package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:40
 * 描述：学生类
 */
public class Student {
    private Integer s_id;  //学生编号
    private String s_username;  //学生用户名
    private String s_password;  //学生密码
    private String s_img;  //学生头像（路径）
    private Integer s_class;  //学生所属班级
    private String s_name;  //学生姓名
    private String s_phone;  //学生电话
    private String s_sex;  //学生性别
    private String s_age;  //学生年龄
    private String s_email;  //学生邮箱

    @Override
    public String toString() {
        return "Student{" +
                "s_id=" + s_id +
                ", s_username='" + s_username + '\'' +
                ", s_password='" + s_password + '\'' +
                ", s_img='" + s_img + '\'' +
                ", s_class=" + s_class +
                ", s_name='" + s_name + '\'' +
                ", s_phone='" + s_phone + '\'' +
                ", s_sex='" + s_sex + '\'' +
                ", s_age='" + s_age + '\'' +
                ", s_email='" + s_email + '\'' +
                '}';
    }

    public Integer getS_id() {
        return s_id;
    }

    public void setS_id(Integer s_id) {
        this.s_id = s_id;
    }

    public String getS_username() {
        return s_username;
    }

    public void setS_username(String s_username) {
        this.s_username = s_username;
    }

    public String getS_password() {
        return s_password;
    }

    public void setS_password(String s_password) {
        this.s_password = s_password;
    }

    public String getS_img() {
        return s_img;
    }

    public void setS_img(String s_img) {
        this.s_img = s_img;
    }

    public Integer getS_class() {
        return s_class;
    }

    public void setS_class(Integer s_class) {
        this.s_class = s_class;
    }

    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public String getS_phone() {
        return s_phone;
    }

    public void setS_phone(String s_phone) {
        this.s_phone = s_phone;
    }

    public String getS_sex() {
        return s_sex;
    }

    public void setS_sex(String s_sex) {
        this.s_sex = s_sex;
    }

    public String getS_age() {
        return s_age;
    }

    public void setS_age(String s_age) {
        this.s_age = s_age;
    }

    public String getS_email() {
        return s_email;
    }

    public void setS_email(String s_email) {
        this.s_email = s_email;
    }

    public Student() {
    }
}
