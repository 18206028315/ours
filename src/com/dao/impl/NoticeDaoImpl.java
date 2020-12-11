package com.dao.impl;

import com.dao.BaseDao;
import com.dao.NoticeDao;
import com.entity.Notice;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/10 11:14
 * 描述:公告增删改查实现类
 */
public class NoticeDaoImpl extends BaseDao implements NoticeDao {
    //查询公告总数
    @Override
    public Integer queryPageTotalCount() {
        String sql = "SELECT count(1) FROM `notice`";
        return Math.toIntExact((Long) queryForSingleValue(sql));
    }
    //分页
    @Override
    public List<Notice> queryUserByPage(Integer pageNo, Integer pageSize) {
        String sql = "SELECT * FROM `notice` LIMIT ?,?";
        return queryForList(Notice.class,sql,pageNo,pageSize);
    }
    //删除公告
    @Override
    public int delete(Integer noriceId) {
        String sql = "DELETE FROM notice WHERE n_id=?";
        return update(sql,noriceId);
    }
    //添加公告
    @Override
    public int insert(Notice addNotice) {
        String sql = "insert into notice (`n_title`,`n_content`,`n_accessory`) values (?,?,?)";
        return update(sql,addNotice.getN_title(),addNotice.getN_content(),addNotice.getN_accessory());
    }
}
