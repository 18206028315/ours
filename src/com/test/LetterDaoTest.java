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
        Integer i=1;
        List<Letter>letters = DataCenter.letterDao().queryByAcceptId(i);
        System.out.println(letters);
    }
}
