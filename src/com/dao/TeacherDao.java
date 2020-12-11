package com.dao;

import com.entity.Grade;
import com.entity.Homework;
import com.entity.Teacher;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/8 17:59
 * 描述：
 */
public interface TeacherDao {

    //查询教师表，用于登录
    Teacher queryTeacherByUsernameAndPassword(String t_username, String t_password);

    //教师修改个人信息
    Integer teacherUpdatePersonalInformation(Teacher teacher);

    //教师修改密码
    Integer teacherUpdatePasswordById(String t_password, Integer t_id);

    /***
     * xpy
     * @param teacher
     * @return
     */
    //添加老师
    int insert(Teacher teacher);
    //删除老师
    int delete(Integer teacherId);
    //更新老师信息
    int updateTeacher(Teacher teacher);
    //查询所有老师
    List<Teacher> queryAll();
    //通过id查询单个老师
    Teacher queryUserById(Integer id);
    //查询老师总数
    Integer queryPageTotalCount();
    //分页
    List<Teacher> queryUserByPage(Integer pageNo,Integer pageSize);









}
