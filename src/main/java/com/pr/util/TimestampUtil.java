package com.pr.util;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import static com.pr.enums.SysConstants.TIME_FORMAT;

public class TimestampUtil {
    /**
     * 将timestamp数据按照格式转换为指定字符串
     *
     * @param timestamp
     * @param format
     * @return
     */
    public static String format2String(Timestamp timestamp, String format) {
        return timestamp.toLocalDateTime().format(DateTimeFormatter.ofPattern(format));
    }

    public static Timestamp lastMonthTime(Timestamp timestamp) {
        Calendar c = Calendar.getInstance();
        c.setTime(timestamp);
        c.add(Calendar.MONTH, -1);
        return new Timestamp(c.getTimeInMillis());
    }

    public static Timestamp nextMonthTime(Timestamp timestamp) {
        Calendar c = Calendar.getInstance();
        c.setTime(timestamp);
        c.add(Calendar.MONTH, 1);
        return new Timestamp(c.getTimeInMillis());
    }

    //字符串转成LocalDateTime
    public static LocalDateTime convertLocalDataTime(String source) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern(TIME_FORMAT);
        LocalDateTime date = null;
        try {
            date = LocalDateTime.parse(source, df);
        } catch (Exception e) {
            return null;
        }
        return date;
    }

    public static Long convertString(String source) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Long date = sdf.parse(source).getTime() / 1000;
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Long convertLocalDataTime(LocalDateTime source) {
        long l = source.toEpochSecond(ZoneOffset.of("+8"));
        return l;
    }

}
