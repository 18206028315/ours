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

    /***
     * xpy
     * @param student
     * @return
     */
    //添加学生
    int insert(Student student);
    //删除学生
    int delete(Integer studentId);
    //更新学生信息
    int updateStudent(Student student);
    //查询所有学生
    List<Student> queryAll();
    //通过id查询单个学生
    Student queryUserById(Integer id);
    //查询学生总数
    Integer queryPageTotalCount();
    //分页
    List<Student> queryUserByPage(Integer pageNo, Integer pageSize);





}
