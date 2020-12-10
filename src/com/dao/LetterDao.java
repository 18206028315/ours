package com.dao;

import com.entity.Letter;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/8 19:00
 * 描述：
 */
public interface LetterDao {
    //根据接收方的帐号查询所有发送给他的私信
    List<Letter> StudentQueryByAccept(String accept);
    //根据发送方帐号查询自己发的所有私信
    List<Letter>StudentQueryBySend(String send);
    //发送私信，插入到letter表里
    Integer StudentInsert(Letter letter);


    //教师根据教师编号查询发给自己的邮件，并且通过状态排序
    List<Letter> teacherQueryLetterByAccept(String l_accept);

     //教师根据教师编号查询自己发送的邮件
    List<Letter> teacherQueryLetterBySend(String l_send);

    //教师发送私信
    Integer teacherInsertLetter(Letter letter);



}
