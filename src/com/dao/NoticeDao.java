package com.dao;

import com.entity.Notice;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/10 11:11
 * 描述:公告增删改查
 */
public interface NoticeDao {

    //查询公告总数
    Integer queryPageTotalCount();

    //分页
    List<Notice> queryUserByPage(Integer begin, Integer pageSize);

    //删除班级
    int delete(Integer classId);

    //添加公告
    int insert(Notice addNotice);
}
