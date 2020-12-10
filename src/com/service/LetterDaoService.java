package com.service;

import com.entity.Letter;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/10 10:42
 * 描述:
 */
public interface LetterDaoService {
    //根据接收方的id查询所有发送给他的私信
    List<Letter> queryByAcceptId(Integer acceptId , String acceptname );
    //根据发送方id查询自己发的所有私信
    List<Letter>queryBySendId(Integer sendId,String sendname);
    //发送私信，插入到letter表里
    int insert(Letter letter);
}
