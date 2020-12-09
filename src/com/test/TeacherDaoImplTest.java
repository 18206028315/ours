package com.test;

import com.dao.TeacherDao;
import com.entity.Teacher;
import com.utils.DataCenter;
import org.junit.Test;

/**
 * 作者：凌宇
 * 日期：2020/12/9 15:13
 * 描述:TeacherDao测试
 */
public class TeacherDaoImplTest {


    //登录测试
    @Test
    public void TeacherLoginTest() {
        String t_username = "tea01";
        String t_password = "123";
        Teacher teacher = new Teacher();
        teacher = DataCenter.teacherDao().queryTeacherByUsernameAndPassword(t_username, t_password);
        System.out.println(teacher);
    }

    //修改个人信息测试
    @Test
    public void TeacherUpdatePersonalInformationTest() {
        Teacher teacher = new Teacher();
        teacher.setT_id(1);
        teacher.setT_username("tea01");
        teacher.setT_password("123");
        teacher.setT_img("520");
        teacher.setT_project("天文");
        teacher.setT_class("2");
        teacher.setT_name("马里奥");
        teacher.setT_phone("18206028354");
        teacher.setT_sex("男");
        teacher.setT_age("18");
        teacher.setT_email("maria@qq.com");
        Integer i = DataCenter.teacherDao().teacherUpdatePersonalInformation(teacher);
        System.out.println(i);
    }

    //教师修改密码测试
    @Test
    public void TeacherUpdatePasswordByIdTest() {
        Integer t_id = 1;
        String t_password = "123456";
        Integer i = DataCenter.teacherDao().teacherUpdatePasswordById(t_password, t_id);
        System.out.println(i);
    }
}
