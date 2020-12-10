package com.dao.impl;

import com.dao.BaseDao;
import com.dao.BulletinDao;
import com.entity.Bulletin;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/9 15:10
 * 描述:
 */
public class BulletinDaoImpl extends BaseDao implements BulletinDao {
    //查询公告，按照bid顺序排列(按照最新的公告降序)
    @Override
    public List<Bulletin> queryBulletinByTime() {
        String sql=" select * from  bulletin  ORDER BY b_id DESC ";
        return queryForList(Bulletin.class,sql);
    }
}
