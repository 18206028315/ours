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

    //接收方收到的私信
    @Test
    public void queryByAcceptIdTest(){
        Letter letter=new Letter();
        String i="stu001";

        List<Letter>letters = DataCenter.letterDao().queryByAcceptId(i);
        System.out.println(letters);
    }

    //发私信
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

    //教师查询自己私信测试
    @Test
    public void TeacherQueryLetterByAcceptTest() {
        String l_accept = "tea01";
        List<Letter> letterList = DataCenter.letterDao().teacherQueryLetterByAccept(l_accept);
        System.out.println(letterList);
    }

    //教师发送私信测试
    @Test
    public void TeacherInsertLetterTeat() {
        Letter letter = new Letter();
        letter.setL_send("tea01");
        letter.setL_sendName("马里奥");
        letter.setL_accept("stu001");
        letter.setL_acceptName("李四");
        letter.setL_title("最近状态不错");
        letter.setL_content("晚上找我补习");
        letter.setL_accessory("我要好好给你补习");
        letter.setL_status("未读");
        Integer i = DataCenter.letterDao().teacherInsertLetter(letter);
        System.out.println(i);
    }

    //教师查询已发私信测试
    @Test
    public void TeacherQueryLetterBySendTest() {
        String l_send = "tea01";
        List<Letter> letterList = DataCenter.letterDao().teacherQueryLetterBySend(l_send);
        System.out.println(letterList);

    }
}
