package com.song.OtherAPI;

import java.util.Calendar;

public class CalendarDemo {
	public static void main(String[] args){
		Calendar calendar=Calendar.getInstance();
		
		getCurrentTime(calendar);//2017��9��24��������
		
		calendar.set(2011,3,20);//����ʱ��
		getCurrentTime(calendar);//2011��4��20��������
		
		calendar.add(Calendar.YEAR,2);//������ƫ��2��(��2��)
		getCurrentTime(calendar);//2013��4��20��������
	}

	/**
	 * ��ȡ��ǰʱ��   �� �� �� ��  ������ȡ
	 */
	public static void getCurrentTime(Calendar calendar) {
		int year=calendar.get(Calendar.YEAR);
		int month=calendar.get(Calendar.MONTH);
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		int week=calendar.get(Calendar.DAY_OF_WEEK);//1   һ�ܵ����ڼ�
		System.out.println(year+"��"+(month+1)+"��"+day+"��"+getWeek(week));
	}

	public static String getWeek(int week) {
		String[] weeks={"","������","����һ","���ڶ�","������","������","������","������"};
		return weeks[week]+"";
	}
}
