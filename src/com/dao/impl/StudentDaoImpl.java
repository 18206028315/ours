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
    public Student StudentQuerystuByuserNamePassW(String username, String password) {
        String sql=" select * from student where s_username= ? and s_password= ? ";
        return queryForOne(Student.class,sql,username,password);
    }
    //改密码
    @Override
    public Integer StudentUpdatePassword(String password,Integer id) {
        String sql="update student set s_password = ? where s_id = ?";
        return update(sql,password,id);
    }
    //修改个人信息
    @Override
    public Integer StudentUpdateMessage(Student student) {
        String sql="update student set s_img = ? ,s_phone = ? ,s_sex = ? , s_age = ? , s_email = ? where s_id = ?";
        return update(sql,student.getS_img(),student.getS_phone(),student.getS_sex(),student.getS_age(),student.getS_email(),student.getS_id());
    }

}
