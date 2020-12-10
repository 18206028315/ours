package com.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 作者：凌宇
 * 日期：2020/12/10 18:47
 * 描述：获取一些信息
 */
public class MessageUtils {

    //获取当前时间
    public static String GetNowTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String nowTime = simpleDateFormat.format(new Date());
        return nowTime;
    }


}
