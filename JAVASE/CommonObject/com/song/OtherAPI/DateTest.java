package com.song.OtherAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 *"2012-3-17"到"2012-4-6"
 *中间有多少天？
 *思路：两个日期相减 
 *
 *1.将日期格式的字符串转成Date对象、
 *2.将Date对象转成毫秒值
 *3.相减，再化为天数
 * */
public class DateTest {
	public static void  main(String[] args){
		Date date=null;
		Date date2=null;
		DateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd");
		try {
			date=dateformat.parse("2012-3-17");
			date2=dateformat.parse("2012-4-6");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		long d1=date.getTime();
		long d2=date2.getTime();
		System.out.println(Math.abs(d2-d1)/1000/60/60/24);
//		System.out.println(date);
//		System.out.println(date2);
	}
}
