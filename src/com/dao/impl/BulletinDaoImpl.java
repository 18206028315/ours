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
    public List<Bulletin> studentQueryBulletinByTime(String classId) {
        String sql=" select DISTINCT  b.* from  bulletin b ,teacher t  WHERE b.b_send=t.t_id AND t.t_class= ? ORDER BY b_id DESC  ";
        return queryForList(Bulletin.class,sql,classId);
    }
}
