package com.dao;

import com.entity.Grade;

/**
 * 作者：凌宇
 * 日期：2020/12/8 18:57
 * 描述：
 */
public interface GradeDao {

    //插入成绩表，用于教师发布作业同时开辟学生作业数据存储空间
    Integer teacherInsertGrade(Grade grade);

    //学生根据hid,sid定位更新作业
    int updateHomeWork(Grade grade);
}
