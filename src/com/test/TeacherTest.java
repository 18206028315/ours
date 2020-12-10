package com.test;

import com.entity.Teacher;
import com.utils.MessageUtils;
import org.junit.Test;

/**
 * 作者：凌宇
 * 日期：2020/12/8 9:45
 * 描述：
 */
public class TeacherTest {

    //获取当前时间测试
    @Test
    public void GetNowTimeTest() {
        String time = MessageUtils.GetNowTime();
        System.out.println(time);
    }
}
