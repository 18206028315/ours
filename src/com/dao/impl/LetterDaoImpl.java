package com.dao.impl;

import com.dao.BaseDao;
import com.dao.LetterDao;
import com.entity.Letter;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/8 19:00
 * 描述：
 */
public class LetterDaoImpl extends BaseDao implements LetterDao {
    //根据接收方id查询到要发给他的消息 按照时间排序
    @Override
    public List<Letter> queryByAcceptId(String accept) {
         String sql="select * from letter where l_accept = ? ORDER BY createTime DESC";
         return queryForList(Letter.class,sql,accept);
    }
    //根据发送方id查询到他发出去的信息，按照时间排序
    @Override
    public List<Letter> queryBySendId(String send) {
        String sql="select * from letter where l_send = ? ORDER BY createTime DESC";
        return queryForList(Letter.class,sql,send);
    }

    //插入信息到letter表里 （发送消息）
    @Override
    public int insert(Letter letter) {
        String sql=" insert into letter (l_send,l_sendName,l_accept,l_acceptName,l_title,l_content,l_accessory,l_status) values(?,?,?,?,?,?,?,'未读')";
        return update(sql,letter.getL_send(),letter.getL_sendName(),letter.getL_accept(),letter.getL_acceptName(),letter.getL_title(),letter.getL_content(),letter.getL_accessory());
    }

}
