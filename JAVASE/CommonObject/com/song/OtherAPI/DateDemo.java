package com.song.OtherAPI;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
	public static void main(String[] args){
		demo_3();
	}
	/**
	 * 2.将日期格式的字符串-->日期对象
	 * 	使用的是DateFormat类中的parse()方法
	 * */
	public static void demo_3() {
		Date date=null;
		
		DateFormat dateformat=DateFormat.getDateInstance();
		
		DateFormat dateformat1=DateFormat.getDateInstance(DateFormat.LONG);//指定已有格式
		
		DateFormat dateformat2=new SimpleDateFormat("yy---MM---dd");//指定自定义格式
		
		try {
			date=dateformat.parse("2017-9-24");
			
			date=dateformat1.parse("2017年9月25日");
			
			date=dateformat2.parse("17---09---19");//Tue Sep 19 00:00:00 CST 2017
		
		} catch (ParseException e) {
			
			e.printStackTrace();
		
		}
		
		System.out.println(date);
		
		
	}
	/**
	 * 对日期对象进行格式化
	 * 1.将日期对象-->日期格式的字符串
	 * 	使用的是DateFormat类中的format方法
	 */
	
	public static void demo_2() {
		Date date=new Date();
		
		//获取日期格式对象。具有着默认的风格 FULL、LONG等可以指定风格
		//DateFormat dateformat=DateFormat.getDateInstance(DateFormat.FULL);//2017年9月24日 星期日
		DateFormat dateformat=DateFormat.getDateInstance(DateFormat.LONG);//2017年9月24日
		String str_date=dateformat.format(date);
		System.out.println(str_date);//2017-9-24
		
		
		//DateFormat dateformat1=DateFormat.getDateTimeInstance();//2017-9-24 9:22:32
		DateFormat dateformat1=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);//2017年9月24日 上午09时23分24秒
		String str_date1=dateformat1.format(date);
		System.out.println(str_date1);
		
		//如果风格是自定义的  
		SimpleDateFormat sdate=new SimpleDateFormat("yyyy/MM/dd");
		String str_date2=sdate.format(date);
		System.out.println(str_date2);
		
	}

	/*
	 *日期对象-->毫秒
	 *	getTime()
	 *毫秒-->日期对象
	 *	1.通过日期对象的构造函数 new Date(毫秒数)
	 * 	2.日期对象setTime()方法;
	 * */
	public static void demo_1() {
		//毫秒-->日期对象
		Date date=new Date(System.currentTimeMillis());
		System.out.println(date);//Sun Sep 24 09:13:46 CST 2017
		date=new Date(21383686189l);//注意这里最后面的l 表示长整型
		System.out.println(date);
		//日期对象-->毫秒
		Date date1=new Date();
		long ldate=date1.getTime();
		System.out.println(ldate);
		
	}
}
