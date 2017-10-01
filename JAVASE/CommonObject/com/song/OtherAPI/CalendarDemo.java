package com.song.OtherAPI;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args){
		Calendar calendar=Calendar.getInstance();
		
		getCurrentTime(calendar);//2017年9月24日星期日
		
		calendar.set(2011,3,20);//设置时间
		getCurrentTime(calendar);//2011年4月20日星期三
		
		calendar.add(Calendar.YEAR,2);//给年数偏移2年(加2年)
		getCurrentTime(calendar);//2013年4月20日星期六
	}

	/**
	 * 获取当前时间   分 年 月 日  单独获取
	 */
	public static void getCurrentTime(Calendar calendar) {
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		int week=calendar.get(Calendar.DAY_OF_WEEK);//1   一周的星期几
		System.out.println(year+"年"+(month+1)+"月"+day+"日"+getWeek(week));
	}

	public static String getWeek(int week) {
		String[] weeks={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
		return weeks[week]+"";
	}
}
