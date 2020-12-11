package com.dao;

import com.entity.Class;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/10 11:11
 * 描述:班级增删改查
 */
public interface ClassDao {

    //查询班级总数
    Integer queryPageTotalCount();

    //分页
    List<Class> queryUserByPage(Integer begin, Integer pageSize);

    //删除班级
    int delete(Integer classId);

    //添加班级
    int insert(Class addClass);
}
