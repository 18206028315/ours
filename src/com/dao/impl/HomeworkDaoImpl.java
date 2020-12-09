package com.dao.impl;

import com.dao.BaseDao;
import com.dao.HomeworkDao;
import com.entity.Homework;

/**
 * 作者：凌宇
 * 日期：2020/12/8 18:59
 * 描述：
 */
public class HomeworkDaoImpl extends BaseDao implements HomeworkDao {
    @Override
    public Integer teacherInsertHomework(Homework homework) {
        return null;
    }

    @Override
    public Homework teacherQueryByTeacherIdAndCreateTime(Integer h_tid, String createTime) {
        return null;
    }

    @Override
    public Integer teacherDeleteHomeworkById(Integer h_id) {
        return null;
    }

    @Override
    public Homework studentQueryByHw() {
        String sql=" select * from  homework ";
        return queryForOne(Homework.class,sql);
    }
}
