package com.entity;

/**
 * 作者：凌宇
 * 日期：2020/12/8 15:35
 * 描述：管理员类
 */
public class Admin {
    private Integer a_id; //管理员编号
    private String a_username; //管理员账号
    private String a_password; //管理员密码
    private String a_phone;  //管理员电话
    private String a_img;  //管理员头像（路径）

    public Admin(String a_username, String a_password) {
        this.a_username = a_username;
        this.a_password = a_password;
    }

    public Integer getA_id() {
        return a_id;
    }

    public void setA_id(Integer a_id) {
        this.a_id = a_id;
    }

    public String getA_username() {
        return a_username;
    }

    public void setA_username(String a_username) {
        this.a_username = a_username;
    }

    public String getA_password() {
        return a_password;
    }

    public void setA_password(String a_password) {
        this.a_password = a_password;
    }

    public String getA_phone() {
        return a_phone;
    }

    public void setA_phone(String a_phone) {
        this.a_phone = a_phone;
    }

    public String getA_img() {
        return a_img;
    }

    public void setA_img(String a_img) {
        this.a_img = a_img;
    }

    public Admin() {
    }

    @Override
    public String toString() {
        return "admin{" +
                "a_id=" + a_id +
                ", a_username='" + a_username + '\'' +
                ", a_password='" + a_password + '\'' +
                ", a_phone='" + a_phone + '\'' +
                ", a_img='" + a_img + '\'' +
                '}';
    }
}
