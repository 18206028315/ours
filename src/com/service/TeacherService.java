package com.service;

import com.entity.*;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/10 16:21
 * 描述：教师功能实现类
 */
public interface TeacherService {

    //登录 用户名和密码
    Teacher login(String t_username, String t_password);

    //修改个人信息 老师对象
    Integer teacherUpdatePersonalInformation(Teacher teacher);

    //修改密码 新密码 教师编号
    Integer teacherUpdatePasswordById(String t_password, Integer t_id);

    //发布作业 班级编号 作业对象
    Boolean teacherPublishJob(Integer t_class, Homework homework);

    //删除作业 作业编号 老师所属班级编号
    Boolean teacherDeleteHomeworkById(Integer h_id, Integer t_class);

    //查询单次作业所有人成绩状态
    List<Grade> teacherQueryGradeByHomeworkId(Integer g_hid);

    //查询单次作业的成绩筛选已读未读，已提交已审批
    List<Grade> teacherQueryGradeByHomeworkIdAndHomeworkStatus(Integer g_hid, String status1, String status2);

    //修改评分评语
    Integer teacherUpdateGradeByGradeId(Grade grade);

    //查看收到的私信
    List<Letter> teacherQueryLetterByAccept(String l_accept);

    //查看发出的私信
    List<Letter> teacherQueryLetterBySend(String l_send);

    //查看自己的学生
    List<Student> teacherQueryStudentByClassId(Integer s_class);

    //发布告示



}
