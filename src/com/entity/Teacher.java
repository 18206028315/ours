package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 14:19
 * 描述：教师类
 */
public class Teacher {
    private Integer t_id;  //教师编号
    private String t_username;  //教师用户名（职工号）
    private String t_password;  //教师密码
    private String t_img;  //教师头像（路径）
    private String t_project;  //教师科目
    private String t_class;  //教师所属班级
    private String t_name;  //教师姓名
    private String t_phone;  //教师电话
    private String t_sex;  //教师性别
    private String t_age;  //教师年龄
    private String t_email;  //教师邮箱

    @Override
    public String toString() {
        return "Teacher{" +
                "t_id=" + t_id +
                ", t_username='" + t_username + '\'' +
                ", t_password='" + t_password + '\'' +
                ", t_img='" + t_img + '\'' +
                ", t_project='" + t_project + '\'' +
                ", t_class='" + t_class + '\'' +
                ", t_name='" + t_name + '\'' +
                ", t_phone='" + t_phone + '\'' +
                ", t_sex='" + t_sex + '\'' +
                ", t_age='" + t_age + '\'' +
                ", t_email='" + t_email + '\'' +
                '}';
    }

    public Integer getT_id() {
        return t_id;
    }

    public void setT_id(Integer t_id) {
        this.t_id = t_id;
    }

    public String getT_username() {
        return t_username;
    }

    public void setT_username(String t_username) {
        this.t_username = t_username;
    }

    public String getT_password() {
        return t_password;
    }

    public void setT_password(String t_password) {
        this.t_password = t_password;
    }

    public String getT_img() {
        return t_img;
    }

    public void setT_img(String t_img) {
        this.t_img = t_img;
    }

    public String getT_project() {
        return t_project;
    }

    public void setT_project(String t_project) {
        this.t_project = t_project;
    }

    public String getT_class() {
        return t_class;
    }

    public void setT_class(String t_class) {
        this.t_class = t_class;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getT_phone() {
        return t_phone;
    }

    public void setT_phone(String t_phone) {
        this.t_phone = t_phone;
    }

    public String getT_sex() {
        return t_sex;
    }

    public void setT_sex(String t_sex) {
        this.t_sex = t_sex;
    }

    public String getT_age() {
        return t_age;
    }

    public void setT_age(String t_age) {
        this.t_age = t_age;
    }

    public String getT_email() {
        return t_email;
    }

    public void setT_email(String t_email) {
        this.t_email = t_email;
    }

    public Teacher() {
    }
}
