package com.test;

import com.entity.Student;
import com.utils.DataCenter;
import org.junit.Test;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/8 18:24
 * 描述:
 */
public class StudentTest {
    //登录
    @Test
    public void studentTest() {
        Student student = new Student();
        String username = "stu001";
        String password = "123";
        student = DataCenter.studentDao().StudentQuerystuByuserNamePassW(username, password);
        System.out.println(student);
    }

    //教师批量查询自己的学生测试
    @Test
    public void TeacherQueryStudentByClassIdTest() {
        Integer s_class = 1;
        List<Student> studentList = DataCenter.studentDao().teacherQueryStudentByClassId(s_class);
        System.out.println(studentList);
    }

}
