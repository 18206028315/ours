package com.dao;

import com.entity.Bulletin;

/**
 * 作者：shizeming
 * 日期: 2020/12/9 14:38
 * 描述:
 */
public interface BulletinDao {
    //查询公告，按照bid顺序排列(按照最新的公告降序)
    Bulletin queryBulletinByTime();
}
