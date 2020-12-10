package com.test;

import com.entity.Bulletin;
import com.utils.DataCenter;
import org.junit.Test;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/10 10:16
 * 描述:
 */
public class BulletinDaoTest {
    //公告栏按照时间排序
    @Test
    public void queryBulletinByTimeTest(String classId){
       List<Bulletin> bulletins= DataCenter.bulletinDao().studentQueryBulletinByTime(classId);
        System.out.println(bulletins);
    }


    //教师发布公告测试
    @Test
    public void TeacherInsertBulletinTest() {
        Bulletin bulletin = new Bulletin();
        bulletin.setB_send(1);
        bulletin.setB_sendName("马里奥");
        bulletin.setB_title("本周课表");
        bulletin.setB_content("本周没课");
        bulletin.setB_accessory("去玩吧");
        Integer i = DataCenter.bulletinDao().teacherInsertBulletin(bulletin);
        System.out.println(i);
    }

    //教师删除公告测试
    @Test
    public void TeacherDeleteBulletinTest() {
        Integer b_id = 2;
        Integer i = DataCenter.bulletinDao().teacherDeleteBulletin(b_id);
        System.out.println(i);
    }
}
