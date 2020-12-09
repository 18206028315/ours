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
    @Override
    public Integer teacherInsertGrade(Grade grade) {
        return null;
    }
}
