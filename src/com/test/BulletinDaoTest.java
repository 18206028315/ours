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
}
