package com.utils;

import com.dao.GradeDao;
import com.dao.HomeworkDao;
import com.dao.TeacherDao;
import com.dao.impl.GradeDaoImpl;
import com.dao.impl.HomeworkDaoImpl;
import com.dao.impl.TeacherDaoImpl;

/**
 * 作者：凌宇
 * 日期：2020/12/9 10:42
 * 描述：数据中心（单例）
 */
public class DataCenter {
    private static TeacherDao teacherDao = null;
    private static HomeworkDao homeworkDao = null;
    private static GradeDao gradeDao = null;



    //老师表的数据库处理
    public static TeacherDao teacherDao() {
        if (teacherDao == null) {
            teacherDao = new TeacherDaoImpl();
        }
        return teacherDao;
    }

    //作业表的数据处理
    public static HomeworkDao homeworkDao() {
        if (homeworkDao == null) {
            homeworkDao = new HomeworkDaoImpl();
        }
        return homeworkDao;
    }

    //成绩表的数据处理
    public static GradeDao gradeDao() {
        if (gradeDao == null) {
            gradeDao = new GradeDaoImpl();
        }
        return gradeDao;
    }
}
