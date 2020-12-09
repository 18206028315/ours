package com.dao;

import com.entity.Homework;

/**
 * 作者：凌宇
 * 日期：2020/12/8 18:47
 * 描述：
 */
public interface HomeworkDao {

    //插入作业表，用于教师发布作业
    Integer teacherInsertHomework(Homework homework);

    //查询作业表，用于教师查询发出的作业详情
    Homework teacherQueryByTeacherIdAndCreateTime(Integer h_tid, String createTime);

    //删除作业表，用于撤回发布的作业
    Integer teacherDeleteHomeworkById(Integer h_id);

    //用于学生查询自己有多少作业
    Homework studentQueryByHw(String classid);

    //查询出老师附件的地址
    Homework studentQueryAccessory(Integer hid);
}
