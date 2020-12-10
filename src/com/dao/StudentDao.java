package com.dao;

import com.entity.Student;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/8 11:04
 * 描述:
 */
public interface StudentDao {

    Student queryUserByUsername(String username);

    //登入用的方法
    Student StudentQuerystuByuserNamePassW(String username,String password);
    //修改密码
    Integer StudentUpdatePassword(String password,Integer id);
    //修改个人信息
    Integer StudentUpdateMessage(Student student);


    //教师查询所有学生概况，跟自己所属同一个班级
    List<Student> teacherQueryStudentByClassId(Integer s_class);





}
