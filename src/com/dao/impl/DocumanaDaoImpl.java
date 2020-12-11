package com.dao.impl;

import com.dao.BaseDao;
import com.dao.DocumanaDao;
import com.entity.Documana;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/10 11:14
 * 描述:教学资料增删改查实现类
 */
public class DocumanaDaoImpl extends BaseDao implements DocumanaDao {
    //查询资料总数
    @Override
    public Integer queryPageTotalCount() {
        String sql = "SELECT count(1) FROM `documana`";
        return Math.toIntExact((Long) queryForSingleValue(sql));
    }
    //分页
    @Override
    public List<Documana> queryDocuByPage(Integer pageNo, Integer pageSize) {
        String sql = "SELECT * FROM `documana` LIMIT ?,?";
        return queryForList(Documana.class,sql,pageNo,pageSize);
    }
    //删除资料
    @Override
    public int delete(Integer docuId) {
        String sql = "DELETE FROM documana WHERE d_id=?";
        return update(sql,docuId);
    }
    //添加资料
    @Override
    public int insert(Documana user) {
        String sql = "insert into documana (`d_name`,`d_content`,`d_path`) values (?,?,?)";
        return update(sql,user.getD_name(),user.getD_content(),user.getD_path());
    }
}
