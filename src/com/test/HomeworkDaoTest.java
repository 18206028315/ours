package com.test;

import com.entity.Homework;
import com.utils.DataCenter;
import org.junit.Test;

/**
 * 作者：凌宇
 * 日期：2020/12/9 18:20
 * 描述：HomeworkDao测试
 */
public class HomeworkDaoTest {

    //教师发布作业表测试
    @Test
    public void TeacherInsertHomeworkTest() {
        Homework homework = new Homework();
        homework.setH_tid(1);
        homework.setH_tName("马里奥");
        homework.setH_title("做完下发的试卷");
        homework.setH_attarName("第一套试卷");
        homework.setH_accessory("马路边");
        Integer i = DataCenter.homeworkDao().teacherInsertHomework(homework);
        System.out.println(i);
    }

    //教师查询作业详情测试
    @Test
    public void TeacherQueryByTeacherIdAndCreateTimeTest() {
        Homework homework = new Homework();
        Integer h_tid = 1;
        String createTime = "2020-12-09 18:27:52";
        homework = DataCenter.homeworkDao().teacherQueryByTeacherIdAndCreateTime(h_tid, createTime);
        System.out.println(homework);
    }

    //教师撤回已发布作业测试
    @Test
    public void TeacherDeleteHomeworkByIdTest() {
        Integer h_id = 5 ;
        Integer i = DataCenter.homeworkDao().teacherDeleteHomeworkById(h_id);
        System.out.println(i);
    }


    @Test
    public void studentQueryByHwTest(){
        Homework homework = new Homework();
        String classid="1";
        homework =  DataCenter.homeworkDao().studentQueryByHw(classid);
        System.out.println(homework);
    }


    @Test
    public void studentQueryaccessoryTest(){
        Homework homework = new Homework();
        Integer hid=1;
        homework =  DataCenter.homeworkDao().studentQueryAccessory(hid);
        System.out.println(homework);
    }
}
