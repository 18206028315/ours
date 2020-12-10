package com.test;

import com.entity.Grade;
import com.utils.DataCenter;
import org.junit.Test;

import java.util.List;

/**
 * 作者：凌宇
 * 日期：2020/12/9 18:37
 * 描述：
 */
public class GradeDaoTest {

    //教师新建成绩测试
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

    //教师删除成绩测试
    @Test
    public void TeacherDeleteGradeByHomeworkIdTest() {
        Integer g_hid = 5;
        Integer i = DataCenter.gradeDao().teacherDeleteGradeByHomeworkId(g_hid);
        System.out.println(i);
    }

    //教师查询成绩表测试
    @Test
    public void TeacherQueryGradeByHomeworkIdTest() {
        Integer g_hid = 1;
        List<Grade> gradeList = DataCenter.gradeDao().teacherQueryGradeByHomeworkId(g_hid);
        System.out.println(gradeList);
    }

    //教师查询作业状态测试
    @Test
    public void TeacherQueryGradeByHomeworkIdAndHomeworkStatusTest() {
        Integer g_hid = 1;
//        String status1 = "已读";
        String status1 = "已提交";
//        String status2 = "未读";
        String status2 = "已审批";
        List<Grade> gradeList = DataCenter.gradeDao().teacherQueryGradeByHomeworkIdAndHomeworkStatus(g_hid, status1, status2);
        System.out.println(gradeList);
    }

    //教师批改作业测试
    @Test
    public void TeacherUpdateGradeByGradeIdTest() {
        Integer g_id = 1;
        String g_grade = "80";
        String g_remark = "写的普通";
        String g_homeworkStatus = "已审批";
        Integer i = DataCenter.gradeDao().teacherUpdateGradeByGradeId(g_id, g_grade, g_remark, g_homeworkStatus);
        System.out.println(i);
    }

}
