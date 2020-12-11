package com.dao.impl;

import com.dao.BaseDao;
import com.dao.TeacherDao;
import com.entity.Grade;
import com.entity.Teacher;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/8 17:59
 * 描述：
 */
public class TeacherDaoImpl extends BaseDao implements TeacherDao {

    /**
     * 教师通过用户名和密码登录
     * @param t_username  用户名
     * @param t_password  密码
     * @return
     */
    @Override
    public Teacher queryTeacherByUsernameAndPassword(String t_username, String t_password) {
        String sql = "SELECT * FROM `Teacher` WHERE `t_username` = ? AND `t_password` = ? ";
        return queryForOne(Teacher.class,sql,t_username,t_password);
    }

    /**
     * 教师修改自己的个人信息
     * @param teacher
     * @return
     */
    @Override
    public Integer teacherUpdatePersonalInformation(Teacher teacher) {
        String sql = "UPDATE `Teacher` SET `t_img` = ? , `t_project` = ? , `t_class` = ? , `t_name` = ? ," +
                " `t_phone` = ? , `t_sex` = ? , `t_age` = ? , `t_email` = ? WHERE `t_id` = ?";
        return update(sql,teacher.getT_img(),teacher.getT_project(),teacher.getT_class(),teacher.getT_name()
        ,teacher.getT_phone(),teacher.getT_sex(),teacher.getT_age(),teacher.getT_email(),teacher.getT_id());
    }

    /**
     * 教师修改密码
     * @param t_password  新密码
     * @param t_id        教师编号
     * @return
     */
    @Override
    public Integer teacherUpdatePasswordById(String t_password, Integer t_id) {
        String sql = "UPDATE `Teacher` SET `t_password` = ? WHERE `t_id` = ? ";
        return update(sql, t_password, t_id);
    }

    /***
     * xpy
     * @param teacher
     * @return
     */
    //添加老师
    @Override
    public int insert(Teacher teacher) {
        String sql = "insert into teacher (`t_username`,`t_password`,`t_img`,`t_project`,`t_class`,`t_name`,`t_phone`,`t_sex`,`t_age`,`t_email`) values (?,?,?,?,?,?,?,?,?,?)";
        return update(sql,teacher.getT_username(),teacher.getT_password(),teacher.getT_img(),teacher.getT_project(),teacher.getClass(),teacher.getT_name(),teacher.getT_phone(),teacher.getT_sex(),teacher.getT_age(),teacher.getT_email());
    }
    //删除老师
    @Override
    public int delete(Integer teacherId) {
        String sql = "DELETE FROM teacher WHERE t_id=?";
        return update(sql,teacherId);
    }
    //更新老师信息
    @Override
    public int updateTeacher(Teacher teacher) {
        String sql = "update teacher set t_username = ?,t_password = ?,t_img = ?,t_project = ?,t_class = ?,t_name = ?,a_phone = ?,t_sex = ?,t_age = ? ,t_email = ? where t_id = ?";
        return update(sql,teacher.getT_username(),teacher.getT_password(),teacher.getT_img(),teacher.getT_project(),teacher.getClass(),teacher.getT_name(),teacher.getT_phone(),teacher.getT_sex(),teacher.getT_age(),teacher.getT_email(),teacher.getT_id());

    }
    //查询所有老师
    @Override
    public List<Teacher> queryAll() {
        String sql = "select * from teacher";
        return queryForList(Teacher.class,sql);
    }
    //通过id查询单个老师
    @Override
    public Teacher queryUserById(Integer id) {
        String sql = "select * from teacher where t_id = ?";
        return queryForOne(Teacher.class,sql,id);
    }
    //查询老师总数
    @Override
    public Integer queryPageTotalCount() {
        String sql = "SELECT count(1) FROM `teacher`";
        return Math.toIntExact((Long) queryForSingleValue(sql));

    }
    //分页
    @Override
    public List<Teacher> queryUserByPage(Integer pageNo, Integer pageSize) {
        String sql = "SELECT * FROM `teacher` LIMIT ?,?";
        return queryForList(Teacher.class,sql,pageNo,pageSize);

    }


}
