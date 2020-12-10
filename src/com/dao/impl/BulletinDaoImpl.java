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

    /**
     * 教师发布公告
     * @param bulletin
     * @return
     */
    @Override
    public Integer teacherInsertBulletin(Bulletin bulletin) {
        String sql = " INSERT INTO `Bulletin` (`b_send`,`b_sendName`,`b_title`,`b_content`,`b_accessory`) VALUES (?,?,?,?,?) ";
        return update(sql, bulletin.getB_send(), bulletin.getB_sendName(), bulletin.getB_title(), bulletin.getB_content(), bulletin.getB_accessory());
    }

    /**
     * 教师删除公告
     * @param b_id
     * @return
     */
    @Override
    public Integer teacherDeleteBulletin(Integer b_id) {
        String sql = " DELETE FROM `Bulletin` WHERE `b_id` = ?  ";
        return update(sql, b_id);
    }

}
