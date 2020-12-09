package com.dao.impl;

import com.dao.BaseDao;
import com.dao.StudentDao;
import com.entity.Student;

/**
 * 作者：凌宇
 * 日期：2020/12/9 15:44
 * 描述：
 */
public class StudentDaoImpl extends BaseDao implements StudentDao {

    @Override
    public Student queryUserByUsername(String username) {
        String sql=" select * from student where s_username= ?  ";
        return queryForOne(Student.class,sql,username);
    }
    //登录
    @Override
    public Student querystuByuserNamePassW(String username, String password) {
        String sql=" select * from student where s_username= ? and s_password= ? ";
        return queryForOne(Student.class,sql,username,password);
    }

}
