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
    @Test
    public void queryBulletinByTimeTest(){
       List<Bulletin> bulletins= DataCenter.bulletinDao().queryBulletinByTime();
        System.out.println(bulletins);
    }
}
