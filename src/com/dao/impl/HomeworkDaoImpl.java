package com.dao.impl;

import com.dao.BaseDao;
import com.dao.HomeworkDao;
import com.entity.Homework;

/**
 * 作者：凌宇
 * 日期：2020/12/8 18:59
 * 描述：
 */
public class HomeworkDaoImpl extends BaseDao implements HomeworkDao {

    /**
     * 教师发布作业
     * @param homework
     * @return
     */
    @Override
    public Integer teacherInsertHomework(Homework homework) {
        String sql = "INSERT INTO `Homework` (`h_tid`,`h_tName`,`h_title`,`h_attarName`,`h_accessory`) VALUES (?,?,?,?,?)";
        return update(sql,homework.getH_tid(),homework.getH_tName(),homework.getH_title(),homework.getH_attarName(),homework.getAccessory());
    }

    @Override
    public Homework teacherQueryByTeacherIdAndCreateTime(Integer h_tid, String createTime) {
        return null;
    }

    @Override
    public Integer teacherDeleteHomeworkById(Integer h_id) {
        return null;
    }

    //按照最新事件排序出老师布置的作业
    @Override
    public Homework studentQueryByHw() {
        String sql=" select * from  homework  ORDER BY createTime DESC ";
        return queryForOne(Homework.class,sql);
    }
    //根据hid查询出作业表的内容，主要是找到地址
    @Override
    public Homework studentQueryaccessory(Integer hid) {
        String sql="select * from  homework  WHERE h_id = ?";
        return queryForOne(Homework.class,sql,hid);
    }
}
