package com.dao.impl;

import com.dao.BaseDao;
import com.dao.ClassDao;
import com.entity.Class;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/10 11:14
 * 描述:班级增删改查实现类
 */
public class ClassDaoImpl extends BaseDao implements ClassDao {
    //查询班级总数
    @Override
    public Integer queryPageTotalCount() {
        String sql = "SELECT count(1) FROM `class`";
        return Math.toIntExact((Long) queryForSingleValue(sql));
    }
    //分页
    @Override
    public List<Class> queryUserByPage(Integer pageNo, Integer pageSize) {
        String sql = "SELECT * FROM `class` LIMIT ?,?";
        return queryForList(Class.class,sql,pageNo,pageSize);
    }
    //删除班级
    @Override
    public int delete(Integer classId) {
        String sql = "DELETE FROM class WHERE c_id=?";
        return update(sql,classId);
    }
    //添加班级
    @Override
    public int insert(Class addClass) {
        String sql = "insert into class (`c_name`,`c_bid`,`c_fid`) values (?,?,?)";
        return update(sql,addClass.getC_name(),addClass.getC_bid(),addClass.getC_fid());
    }
}
