package com.dao.impl;

import com.dao.BaseDao;
import com.dao.GradeDao;
import com.entity.Grade;

/**
 * 作者：凌宇
 * 日期：2020/12/8 18:59
 * 描述：
 */
public class GradeDaoImpl extends BaseDao implements GradeDao {
    //根据作业id和学生di定位更新提交的作业
    @Override
    public int updateHomeWork(Grade grade) {
        String sql="UPDATE grade SET g_accessory = ? WHERE g_hid= ? AND g_sid = ?  ";
        return update(sql,grade.getG_accessory(),grade.getG_hid(),grade.getG_sid());
    }
    //未读变已读
    @Override
    public int updateStatusUnreadToRead(Grade grade) {
        String sql="UPDATE grade SET g_homeworkStatus = '已读' WHERE g_hid= ? AND g_sid = ?  ";
        return update(sql,grade.getG_hid(),grade.getG_sid());
    }
    //将已读状态改为已提交状态
    @Override
    public int updateStatusReadToSubmitted(Grade grade) {
        String sql="UPDATE grade SET g_homeworkStatus = '已提交' WHERE g_hid= ? AND g_sid = ?  ";
        return update(sql,grade.getG_hid(),grade.getG_sid());
    }
    //将已提交状态改为已审核状态
    @Override
    public int updateStatusSubmittedToApproval(Grade grade) {
        String sql="UPDATE grade SET g_homeworkStatus = '已审批' WHERE g_hid= ? AND g_sid = ?  ";
        return update(sql,grade.getG_hid(),grade.getG_sid());
    }
    //查看成绩，评语等等
    @Override
    public Grade queryBySid(Integer sid) {
        String sql=" select * from grade where g_sid= ?  ";
        return queryForOne(Grade.class,sql,sid);
    }

    @Override
    public Integer teacherInsertGrade(Grade grade) {
        return null;
    }
}
