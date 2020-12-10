package com.dao;

import com.entity.Grade;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/8 18:57
 * 描述：
 */
public interface GradeDao {

    //教师插入成绩表，用于教师发布作业同时开辟学生作业数据存储空间
    Integer teacherInsertGrade(Grade grade);

    //教师删除成绩表，用于删除作业时同步删除成绩表数据（批量删除）
    Integer teacherDeleteGradeByHomeworkId(Integer g_hid);

    //教师查询本次作业的成绩表，用于界面初始化（所有人）
    List<Grade> teacherQueryGradeByHomeworkId(Integer g_hid);

    //教师查询本次作业未提交的人，用于提醒交作业,同时进行排序
    List<Grade> teacherQueryGradeByHomeworkIdAndHomeworkStatus(Integer g_hid, String status1, String status2);

    //教师单个批改作业以及写评语
    Integer teacherUpdateGradeByGradeId(Integer g_id, String g_grade, String g_remark,String g_homeworkStatus);


    //学生根据hid,sid定位更新作业
    Integer studentUpdateHomeWork(Grade grade);

    //将未读状态改为已读状态
    Integer studentUpdateStatusUnreadToRead(Grade grade);

    //将已读状态改为已提交状态
    Integer studentUpdateStatusReadToSubmitted(Grade grade);

    //将已提交改为已审核
    Integer studentUpdateStatusSubmittedToApproval(Grade grade);

    //查看成绩，评语等等
    List<Grade> studentqueryBySid(Integer sid);
}
