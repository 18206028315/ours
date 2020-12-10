package com.service.Impl;

import com.dao.StudentDao;
import com.dao.impl.StudentDaoImpl;
import com.entity.*;
import com.service.StudentService;
import com.utils.DataCenter;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/8 18:10
 * 描述:
 */
public class StudentServiceImpl implements StudentService {

    //学生登录帐号
    @Override
    public Student login(String username, String password) {

        return DataCenter.studentDao().StudentQuerystuByuserNamePassW(username, password);
    }
    //学生改密码
    @Override
    public Integer StudentUpdatePassword(String password, Integer id) {
        return DataCenter.studentDao().StudentUpdatePassword(password, id);
    }
    //学生修改个人信息
    @Override
    public Integer StudentUpdateMessage(Student student) {
        return DataCenter.studentDao().StudentUpdateMessage(student);
    }
    //查学生收到的所有私信
    @Override
    public List<Letter> StudentQueryByAccept(String accept) {
        return DataCenter.letterDao().StudentQueryByAccept(accept);
    }
    //查学生发送的所有私信
    @Override
    public List<Letter> StudentQueryBySend(String send) {
        return DataCenter.letterDao().StudentQueryBySend(send);
    }

    //学生发送信息
    @Override
    public Integer StudentInsert(Letter letter) {
        return DataCenter.letterDao().StudentInsert(letter);
    }

    //学生查自己自己有多少作业
    @Override
    public List<Homework> studentQueryByHw(String classid) {
        return DataCenter.homeworkDao().studentQueryByHw(classid);
    }

    //查询出老师附件的地址
    @Override
    public Homework studentQueryAccessory(Integer hid) {
        return DataCenter.homeworkDao().studentQueryAccessory(hid);
    }

     //学生交作业
    @Override
    public Integer studentUpdateHomeWork(Grade grade) {
        return DataCenter.gradeDao().studentUpdateHomeWork(grade);
    }

    //学生将未读状态改为已读状态
    @Override
    public Integer studentUpdateStatusUnreadToRead(Grade grade) {
        return DataCenter.gradeDao().studentUpdateStatusUnreadToRead(grade);
    }

    //学生将已读状态改为已提交状态
    @Override
    public Integer studentUpdateStatusReadToSubmitted(Grade grade) {
        return DataCenter.gradeDao().studentUpdateStatusReadToSubmitted(grade);
    }

    //学生将已提交改为已审核
    @Override
    public Integer studentUpdateStatusSubmittedToApproval(Grade grade) {
        return DataCenter.gradeDao().studentUpdateStatusSubmittedToApproval(grade);
    }

    //学生查看成绩，评语等等
    @Override
    public List<Grade> studentqueryBySid(Integer sid) {
        return DataCenter.gradeDao().studentqueryBySid(sid);
    }

    //学生查询公告
    @Override
    public List<Bulletin> studentQueryBulletinByTime(String classId) {
        return DataCenter.bulletinDao().studentQueryBulletinByTime(classId);
    }
}
