package com.dao.impl;

import com.dao.BaseDao;
import com.dao.LetterDao;
import com.entity.Letter;

/**
 * 作者：凌宇
 * 日期：2020/12/8 19:00
 * 描述：
 */
public class LetterDaoImpl extends BaseDao implements LetterDao {
    //根据接收方id查询到要发给他的消息
    @Override
    public Letter queryByAcceptId(Integer acceptId) {
         String sql="select * from letter where l_accept = ?  ";
        return queryForOne(Letter.class,sql,acceptId);
    }
   //插入信息到letter表里 （发送消息）
    @Override
    public int insert(Letter letter) {
        String sql=" insert into letter (l_send,I_sendName,l_accept,I_acceptName,l_title,l_content,I_accessory) values(?,?,?,?,?,?,?)";
        return update(sql,letter.getL_send(),letter.getI_sendName(),letter.getL_accept(),letter.getI_acceptName(),letter.getL_title(),letter.getL_content(),letter.getI_accessory());
    }
}
