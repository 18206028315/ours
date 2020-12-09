package com.dao.impl;

import com.dao.BaseDao;
import com.dao.GradeDao;
import com.entity.Grade;

import java.util.List;

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

    /**
     * 教师插入成绩表
     * @param grade
     * @return
     */
    @Override
    public Integer teacherInsertGrade(Grade grade) {
        String sql = "INSERT INTO `Grade` (`g_hid`,`g_tName`,`g_sid`,`g_sName`,`g_hTitle`,`g_homeworkStatus`) VALUES (?,?,?,?,?,?) ";
        return update(sql, grade.getG_hid(), grade.getG_tName(), grade.getG_sid(), grade.getG_sName(), grade.getG_hTitle(), grade.getG_homeworkStatus());
    }

    /**
     * 教师通过作业编号批量删除成绩表
     * @return
     */
    @Override
    public Integer teacherDeleteGradeByHomeworkId(Integer g_hid) {
        String sql = "DELETE FROM `Grade` WHERE `g_hid` = ?";
        return update(sql, g_hid);
    }

    /**
     * 教师通过作业编号查询成绩表
     * @param g_hid  作业编号
     * @return
     */
    @Override
    public List<Grade> teacherQueryGradeByHomeworkId(Integer g_hid) {
        String sql = "SELECT * FROM `Grade` WHERE `g_hid` = ?";
        return queryForList(Grade.class, sql, g_hid);
    }

    /**
     * 教师通过作业编号和成绩状态查询，通过成绩状态排序
     *
     * @param g_hid
     * @param status1
     * @param status2
     * @return
     */
    @Override
    public List<Grade> teacherQueryGradeByHomeworkIdAndHomeworkStatus(Integer g_hid, String status1, String status2) {
        String sql = "SELECT * FROM `Grade` WHERE `g_hid` = ? AND (`g_homeworkStatus` = ? OR `g_homeworkStatus` = ?) ORDER BY `g_homeworkStatus` DESC";
        return queryForList(Grade.class, sql, g_hid, status1, status2);
    }

}
