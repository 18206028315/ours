package com.test;

import com.entity.Student;
import com.utils.DataCenter;
import org.junit.Test;

/**
 * 作者：shizeming
 * 日期: 2020/12/8 18:24
 * 描述:
 */
public class StudentTest {
@Test
    public void studentTest(){
        Student student=new Student();
         String username="stu001";
         String password="123";

        student=   DataCenter.studentDao().querystuByuserNamePassW(username,password);
        System.out.println(student);

    }


}
