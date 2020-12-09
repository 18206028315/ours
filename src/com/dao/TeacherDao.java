package com.dao;

import com.entity.Grade;
import com.entity.Homework;
import com.entity.Teacher;

/**
 * 作者：凌宇
 * 日期：2020/12/8 17:59
 * 描述：
 */
public interface TeacherDao {

    //查询教师表，用于登录
    Teacher queryTeacherByUsernameAndPassword(String t_username, String t_password);

    //教师修改个人信息
    Integer update(Teacher teacher);



    //插入成绩表，用于教师发布作业同时开辟学生作业数据存储空间
    Integer teacherInsertGrade(Grade grade);




}