package com.service;

import com.entity.*;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/8 18:10
 * 描述:
 */
public interface StudentService {
    //登入用的方法
    Student login(String username,String password);

    //修改密码
    Integer StudentUpdatePassword(String password,Integer id);

    //修改个人信息
    Integer StudentUpdateMessage(Student student);

    //根据接收方的帐号查询所有发送给他的私信
    List<Letter> StudentQueryByAccept(String accept);

    //根据发送方帐号查询自己发的所有私信
    List<Letter>StudentQueryBySend(String send);

    //发送私信，插入到letter表里
    Integer StudentInsert(Letter letter);

    //用于学生查询自己有多少作业
    List<Homework> studentQueryByHw(String classid);

    //查询出老师附件的地址
    Homework studentQueryAccessory(Integer hid);

    //学生根据hid,sid定位更新作业
    Integer studentUpdateHomeWork(Grade grade);

    //将未读状态改为已读状态
    Integer studentUpdateStatusUnreadToRead(Grade grade);

    //将已读状态改为已提交状态
    Integer studentUpdateStatusReadToSubmitted(Grade grade);

    //将已提交改为已审核
    Integer studentUpdateStatusSubmittedToApproval(Grade grade);

    //查看成绩，评语等等
    List<Grade> studentqueryBySid(Integer sid);

    //查询公告，按照bid顺序排列(按照最新的公告降序)
    List<Bulletin> studentQueryBulletinByTime(String classId);
}
