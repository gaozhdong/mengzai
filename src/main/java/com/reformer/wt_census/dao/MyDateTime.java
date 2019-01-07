package com.reformer.wt_census.dao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class MyDateTime {
    public static String getPoid() {
        SimpleDateFormat sdt = new SimpleDateFormat("yyyMMddHHmmss");
        return sdt.format(new Date());
    }

    //两个时间差
    public static String Daycha(String endtime) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        String thistime = MyDateTime.getTime();
        Date d1 = df.parse(endtime.toString());
        Date d2 = df.parse(thistime.toString());
        long diff = d2.getTime() - d1.getTime();//这样得到的差值是微秒级别
        long days = diff / (1000 * 60 * 60 * 24);
        long hours = (diff % (1000 * 60 * 60 * 24)) / (1000 * 60 * 60);
        long minutes = (diff % (1000 * 60 * 60)) / (1000 * 60);
        String sR = (days + "天" + hours + "小时" + minutes + "分钟");
        if (days == 0L && hours == 0L) {
            sR = (minutes + "分钟前");
        }
        if (days == 0L && hours != 0L) {
            sR = (hours + "小时前");
        }
        if (days != 0L) {
            sR = (days + "天前");
        }
        return sR;
    }

    //两个时间差是否超期的判断
    public static String Dayup(String endtime) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String thistime = getTimes();
        Date d1 = df.parse(endtime.toString());
        Date d2 = df.parse(thistime.toString());
        long diff = d1.getTime() - d2.getTime();//这样得到的差值是微秒级别
        if (diff > 0) {
            return "1";
        } else {
            return "-1";
        }
    }

    //根据工期时间，和启动时间，算结束时间
    public static String plusDay(String startDay, int count) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse(startDay);
        Calendar cl = Calendar.getInstance();
        cl.setTime(date);
        cl.add(Calendar.DATE, count);
        return sdf.format(cl.getTime());
    }

    public static String getTime() {
        SimpleDateFormat sdt = new SimpleDateFormat("yyy-MM-dd HH:mm");
        return sdt.format(new Date());
    }

    public static String getTimes() {
        SimpleDateFormat sdt = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        return sdt.format(new Date());
    }

    public static String getDay() {
        SimpleDateFormat sdt = new SimpleDateFormat("yyy-MM-dd");
        return sdt.format(new Date());
    }
}
