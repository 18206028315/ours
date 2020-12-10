package com.utils;

import com.dao.*;
import com.dao.impl.*;
import com.service.Impl.TeacherServiceImpl;
import com.service.TeacherService;

/**
 * 作者：凌宇
 * 日期：2020/12/9 10:42
 * 描述：数据中心（单例）
 */
public class DataCenter {
    private static TeacherDao teacherDao = null;
    private static HomeworkDao homeworkDao = null;
    private static GradeDao gradeDao = null;
    private static StudentDao studentDao=null;
    private static BulletinDao bulletinDao=null;
    private static LetterDao letterDao=null;
    private static TeacherService teacherService = null;


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
    //学生表的数据处理
    public static StudentDao studentDao(){
        if (studentDao == null){
            studentDao=new StudentDaoImpl();
        }
        return studentDao;
    }
    //公告栏的数据处理
    public static BulletinDao bulletinDao(){
        if (bulletinDao == null){
            bulletinDao=new BulletinDaoImpl();
        }
        return bulletinDao;
    }
    //私信的数据处理
    public static LetterDao letterDao(){
        if (letterDao == null){
            letterDao=new LetterDaoImpl();
        }
        return letterDao;
    }


    //教师功能表的数据处理
    public static TeacherService teacherService() {
        if (teacherService == null) {
            teacherService = new TeacherServiceImpl();
        }
        return teacherService;
    }
}
