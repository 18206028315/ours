package com.dao;

import com.entity.Documana;

import java.util.List;

/**
 * 作者：xupeiyuan
 * 日期: 2020/12/10 11:11
 * 描述:教学资料增删改查
 */
public interface DocumanaDao {

    //查询教学资料总数
    Integer queryPageTotalCount();

    //分页
    List<Documana> queryDocuByPage(Integer begin, Integer pageSize);

    //删除资料
    int delete(Integer docuId);

    //添加资料
    int insert(Documana addDocumana);
}
