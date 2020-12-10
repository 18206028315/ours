package com.dao.impl;

import com.dao.BaseDao;
import com.dao.HomeworkDao;
import com.entity.Homework;

import java.util.List;

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
        return update(sql,homework.getH_tid(),homework.getH_tName(),homework.getH_title(),homework.getH_attarName(),homework.getH_accessory());
    }

    /**
     * 教师通过教师编号和作业的创建时间定位作业
     * @param h_tid
     * @param createTime
     * @return
     */
    @Override
    public Homework teacherQueryByTeacherIdAndCreateTime(Integer h_tid, String createTime) {
        String sql = "SELECT * FROM `Homework` WHERE `h_tid` = ? AND `createTime` = ?";
        return queryForOne(Homework.class, sql, h_tid, createTime);
    }

    /**
     * 教师删除作业表
     * @param h_id
     * @return
     */
    @Override
    public Integer teacherDeleteHomeworkById(Integer h_id) {
        String sql = "DELETE FROM `Homework` WHERE `h_id` = ? ";
        return update(sql, h_id);
    }

    //按照最新事件排序出老师布置的作业
    @Override
    public List<Homework>  studentQueryByHw(String classid) {
        String sql="SELECT DISTINCT h.*FROM (teacher t LEFT JOIN homework h ON t.t_id=h.h_tid )LEFT JOIN grade g ON g.g_hid=h.h_id WHERE t.t_class= ? ORDER BY createTime DESC ";
        return queryForList(Homework.class,sql,classid);
    }

    //根据hid查询出作业表的内容，主要是找到地址
    @Override
    public Homework studentQueryAccessory(Integer hid) {
        String sql="select * from  homework  WHERE h_id = ?";
        return queryForOne(Homework.class,sql,hid);
    }
}
