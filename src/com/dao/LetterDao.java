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
    List<Letter> queryByAcceptId(String accept);
    //根据发送方帐号查询自己发的所有私信
    List<Letter>queryBySendId(String send);

    List<Letter> teacherQueryLetterByTeacherId(Integer t_id);

    //发送私信，插入到letter表里
    int insert(Letter letter);
}
