package com.song.OtherAPI;

import java.util.Calendar;

/*
 * 给定任意一年   输出那一年 2月有多少天
 * */
public class CalendarTest {
	public static void main(String[] args){
		int year=2019;
		getYearOfTowMonth(year);
	}

	public static void getYearOfTowMonth(int year) {
		Calendar c=Calendar.getInstance();
		c.set(year, 2, 1);//设置时间为当年的3月1号
		c.add(Calendar.DAY_OF_MONTH,-1);
		System.out.println(year+"年2月有"+c.get(Calendar.DAY_OF_MONTH)+"天");
	}
}
