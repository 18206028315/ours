package com.dao.impl;

import com.dao.BaseDao;
import com.dao.StudentDao;
import com.entity.Student;

import java.util.List;

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

    /**
     * 教师通过班级编号查询学生
     * @param s_class
     * @return
     */
    @Override
    public List<Student> teacherQueryStudentByClassId(Integer s_class) {
        String sql = "SELECT * FROM `Student` WHERE `s_class` = ?";
        return queryForList(Student.class, sql, s_class);
    }

    /***
     * xpy
     * @param student
     * @return
     */
    //添加学生
    @Override
    public int insert(Student student) {
        String sql = "insert into student (`s_username`,`s_password`,`s_img`,`s_class`,`s_name`,`s_phone`,`s_sex`,`s_age`,`s_email`) values (?,?,?,?,?,?,?,?,?)";
        return update(sql,student.getS_username(),student.getS_password(),student.getS_img(),student.getS_class(),student.getS_name(),student.getS_phone(),student.getS_sex(),student.getS_age(),student.getS_email());
    }
    //删除学生
    @Override
    public int delete(Integer studentId) {
        String sql = "DELETE FROM student WHERE s_id=?";
        return update(sql,studentId);
    }
    //更新学生信息
    @Override
    public int updateStudent(Student student) {
        String sql = "update student set s_username = ?,s_password = ?,s_img = ?,s_class = ?,s_name = ?,s_phone = ?,s_sex = ?,s_age = ? , s_email = ? where s_id = ?";
        return update(sql,student.getS_username(),student.getS_password(),student.getS_img(),student.getS_class(),student.getS_name(),student.getS_phone(),student.getS_sex(),student.getS_age(),student.getS_email(),student.getS_id());

    }
    //查询所有学生
    @Override
    public List<Student> queryAll() {
        String sql = "select * from student";
        return queryForList(Student.class,sql);
    }
    //通过id查询单个学生
    @Override
    public Student queryUserById(Integer id) {
        String sql = "select * from student where s_id = ?";
        return queryForOne(Student.class,sql,id);
    }
    //查询学生总数
    @Override
    public Integer queryPageTotalCount() {
        String sql = "SELECT count(1) FROM `student`";
        return Math.toIntExact((Long) queryForSingleValue(sql));

    }
    //分页
    @Override
    public List<Student> queryUserByPage(Integer pageNo, Integer pageSize) {
        String sql = "SELECT * FROM `student` LIMIT ?,?";
        return queryForList(Student.class,sql,pageNo,pageSize);

    }
}
