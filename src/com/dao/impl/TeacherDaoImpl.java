package com.dao.impl;

import com.dao.BaseDao;
import com.dao.TeacherDao;
import com.entity.Grade;
import com.entity.Teacher;

/**
 * 作者：凌宇
 * 日期：2020/12/8 17:59
 * 描述：
 */
public class TeacherDaoImpl extends BaseDao implements TeacherDao {
    @Override
    public Teacher queryTeacherByUsernameAndPassword(String t_username, String t_password) {
        return null;
    }

    @Override
    public Integer update(Teacher teacher) {
        return null;
    }


}
