package com.dao;

import com.entity.Student;

/**
 * 作者：shizeming
 * 日期: 2020/12/8 11:04
 * 描述:
 */
public interface StudentDao {
    Student queryUserByUsername(String username);
    //登入用的方法
    Student querystuByuserNamePassW(String username,String password);





}
