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

    @Test
    public void TeacherInsertHomeworkTest() {
        Homework homework = new Homework();
        homework.setH_tid(1);
        homework.setH_tName("马里奥");
        homework.setH_title("做完下发的试卷");
        homework.setH_attarName("第一套试卷");
        homework.setAccessory("马路边");
        Integer i = DataCenter.homeworkDao().teacherInsertHomework(homework);
        System.out.println(i);
    }
}
