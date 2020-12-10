package com.test;

import com.entity.Letter;
import com.utils.DataCenter;
import org.junit.Test;

import java.util.List;

/**
 * 作者：shizeming
 * 日期: 2020/12/9 20:47
 * 描述:
 */
public class LetterDaoTest {
    @Test
    public void queryByAcceptIdTest(){
        Letter letter=new Letter();
        String i="stu001";

        List<Letter>letters = DataCenter.letterDao().queryByAcceptId(i);
        System.out.println(letters);
    }
    @Test
    public void insertTest(){
        Letter letter=new Letter();
        letter.setL_send("stu001");
        letter.setL_sendName("雷婷");
        letter.setL_accept("tea001");
        letter.setL_acceptName("李四");
        letter.setL_title("哦豁");
        letter.setL_content("宝贝");
        letter.setL_accessory("123");
       int i= DataCenter.letterDao().insert(letter);
        System.out.println(i);
    }
}
