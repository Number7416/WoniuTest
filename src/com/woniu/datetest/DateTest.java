package com.woniu.datetest;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class DateTest {
    //1.System类中的currentTimeMillis()
    @Test
    public void test1() {
        long t = System.currentTimeMillis();
        System.out.println(t);
    }

    //2.java.util.Data类
    // 2.1 两个构造器的使用:
//       构造器一: Date():创建一个对应当前时间的Date对象.
    //  构造器二: 指定毫秒数的Date对象.
    // 2.2 两个方法的使用:
    //toString():显示当前的年, 月, 日, 时, 分, 秒.
    //getTime():获取当前Date对象对应的毫秒数 (时间戳).

    // 3. java.sql.Date 对应着数据库中的日期类型的变量.
    //- 如何实例化.
    @Test
    public void test2() {
        //构造器一: Date():创建一个对应当前时间的Date对象.
        Date date = new Date();
        System.out.println(date.toString());//Wed Aug 28 15:27:51 CST 2019
        System.out.println(date.getTime());//1566977392148
        //  构造器二: 指定毫秒数的Date对象.
            Date date1 = new Date(1566977392148L);
        System.out.println(date1);

        //创建java.sql.Date对象.
        java.sql.Date date2 = new java.sql.Date(1566977392148L);
        System.out.println(date2);//2019-08-28

        //Calendar是一个抽象类，主要完成日期字段之间的互相操作功能
        Calendar instance = Calendar.getInstance();

        instance.set(Calendar.DAY_OF_MONTH, 10); //更改当前月的几号,注意更改的是本身
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

        instance.add(Calendar.DAY_OF_MONTH , -4);
        System.out.println(instance.get(Calendar.DAY_OF_MONTH));

        Date date3 = instance.getTime();
        System.out.println(date);
    }
}
