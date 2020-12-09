package com.service;

import com.entity.Student;

/**
 * 作者：shizeming
 * 日期: 2020/12/8 18:10
 * 描述:
 */
public interface StudentService {
    Student queryUserByUsername(String username);

    Student login(String username,String password);

}
