package com.ours.test;

import org.junit.Test;

/**
 * 作者：凌宇
 * 日期：2020/12/5 10:39
 * 描述：
 */
public class User {
    private String User;

    public String getUser() {
        return User;
    }

    private  String email;

    public String sax;

    @Override
    public String toString() {
        return "User{" +
                "User='" + User + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setUser(String user) {
        User = user;
    }


}
