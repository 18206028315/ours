package com.test;

import com.entity.Homework;
import com.utils.DataCenter;
import com.utils.MessageUtils;
import org.junit.Test;

/**
 * 作者：凌宇
 * 日期：2020/12/10 19:37
 * 描述：教师功能表的测试
 */
public class TeacherServiceTest {

    //教师发布作业测试
    @Test
    public void TeacherPublishJobTest() {
        Homework homework = new Homework();
        homework.setH_tid(1);
        homework.setH_tName("马里奥");
        homework.setH_title("做完下发的试卷");
        homework.setH_attarName("第十套试卷");
        homework.setH_accessory("马路边找一找");
        homework.setCreateTime(MessageUtils.GetNowTime());
        Integer t_class = 1;
        System.out.println(DataCenter.teacherService().teacherPublishJob(t_class, homework));
    }

    //教师删除作业测试
    @Test
    public void TeacherDeleteHomeworkById() {
        Integer h_id = 8;
        Integer t_class = 1;
        System.out.println(DataCenter.teacherService().teacherDeleteHomeworkById(h_id, t_class));
    }


}
