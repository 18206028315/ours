package com.test;

import com.entity.Grade;
import com.utils.DataCenter;
import org.junit.Test;

/**
 * 作者：凌宇
 * 日期：2020/12/9 18:37
 * 描述：
 */
public class GradeDaoTest {

    @Test
    public void TeacherInsertGradeTest() {
        Grade grade = new Grade();
        grade.setG_hid(5);
        grade.setG_tName("马里奥");
        grade.setG_sid(1);
        grade.setG_sName("李四");
        grade.setG_hTitle("做完下发的试卷");
        grade.setG_homeworkStatus("未读");
        Integer i = DataCenter.gradeDao().teacherInsertGrade(grade);
        System.out.println(i);
    }
}
