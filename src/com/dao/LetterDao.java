package com.dao;

import com.entity.Letter;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/8 19:00
 * 描述：
 */
public interface LetterDao {

    List<Letter> teacherQueryLetterByTeacherId(Integer t_id);

    //根据接收方的id查询所有发送给他的私信
    List<Letter> queryByAcceptId(Integer acceptId );
    //发送私信，插入到letter表里
    int insert(Letter letter);
}
