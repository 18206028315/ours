package com.dao;

import com.entity.Admin;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/9 10:04
 * 描述:管理员增删改查
 */
public interface AdminDao {

    //登入验证
    Admin queryUserByNameAndPassword(Admin admin);

    //查询管理员总人数
    Integer queryPageTotalCount();

    //分页
    List<Admin> queryUserByPage(Integer begin, Integer pageSize);

    //修改个人信息
    int updatePass(Admin admin);

    //删除管理员
    int delete(Integer userId);

    //添加管理员
    int insert(Admin user);
}
