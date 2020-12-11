package com.dao.impl;

import com.dao.AdminDao;
import com.dao.BaseDao;
import com.entity.Admin;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/9 10:06
 * 描述:管理员增删改查实现类
 */
public class AdminDaoImpl extends BaseDao implements AdminDao {
    //登入验证
    @Override
    public Admin queryUserByNameAndPassword(Admin admin) {
        String sql = "SELECT * FROM `admin` WHERE `a_username`= ? AND `a_password`= ?";
        return queryForOne(Admin.class, sql, admin.getA_username(), admin.getA_password());
    }
    //查询管理员总人数
    @Override
    public Integer queryPageTotalCount() {
        String sql = "SELECT count(1) FROM `admin`";
        return Math.toIntExact((Long) queryForSingleValue(sql));
    }
    //分页
    @Override
    public List<Admin> queryUserByPage(Integer pageNo, Integer pageSize) {
        String sql = "SELECT * FROM `admin` LIMIT ?,?";
        return queryForList(Admin.class,sql,pageNo,pageSize);
    }
    //修改个人信息
    @Override
    public int updatePass(Admin admin) {
        String sql = "update admin set a_username = ?,a_password = ?,a_phone = ?,a_img = ? where a_id = ?";
        return update(sql,admin.getA_username(),admin.getA_password(),admin.getA_phone(),admin.getA_img(),admin.getA_id());
    }

    //删除管理员
    @Override
    public int delete(Integer userId) {
        String sql = "DELETE FROM admin WHERE a_id=?";
        return update(sql,userId);
    }
    //添加管理员
    @Override
    public int insert(Admin user) {
        String sql = "insert into admin (`a_username`,`a_password`,`a_phone`,`a_img`) values (?,?,?,?)";
        return update(sql,user.getA_username(),user.getA_password(),user.getA_phone(),user.getA_img());
    }
}
