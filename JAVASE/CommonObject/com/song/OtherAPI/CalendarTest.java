package com.song.OtherAPI;

import java.util.Calendar;

/*
 * ��������һ��   �����һ�� 2���ж�����
 * */
public class CalendarTest {
	public static void main(String[] args){
		int year=2019;
		getYearOfTowMonth(year);
	}

	public static void getYearOfTowMonth(int year) {
		Calendar c=Calendar.getInstance();
		c.set(year, 2, 1);//����ʱ��Ϊ�����3��1��
		c.add(Calendar.DAY_OF_MONTH,-1);
		System.out.println(year+"��2����"+c.get(Calendar.DAY_OF_MONTH)+"��");
	}
}
