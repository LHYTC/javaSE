package com.leno.aggregate;

import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author LHYTC
 * @Title: 时间测试类
 * @Package
 * @Description: 用于测试时间处理函数
 * @date 2021-08-11 22:19
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        //时间格式化类
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateStr = format.format(date);
        System.out.println(dateStr);
        try {
            Date strToDate = format.parse(dateStr);
            System.out.println(strToDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date.getTime());

        //日历类
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        calendar.setTime(date);
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
    }
}
