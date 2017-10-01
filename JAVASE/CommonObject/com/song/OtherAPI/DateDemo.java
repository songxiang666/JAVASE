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
	 * 2.�����ڸ�ʽ���ַ���-->���ڶ���
	 * 	ʹ�õ���DateFormat���е�parse()����
	 * */
	public static void demo_3() {
		Date date=null;
		
		DateFormat dateformat=DateFormat.getDateInstance();
		
		DateFormat dateformat1=DateFormat.getDateInstance(DateFormat.LONG);//ָ�����и�ʽ
		
		DateFormat dateformat2=new SimpleDateFormat("yy---MM---dd");//ָ���Զ����ʽ
		
		try {
			date=dateformat.parse("2017-9-24");
			
			date=dateformat1.parse("2017��9��25��");
			
			date=dateformat2.parse("17---09---19");//Tue Sep 19 00:00:00 CST 2017
		
		} catch (ParseException e) {
			
			e.printStackTrace();
		
		}
		
		System.out.println(date);
		
		
	}
	/**
	 * �����ڶ�����и�ʽ��
	 * 1.�����ڶ���-->���ڸ�ʽ���ַ���
	 * 	ʹ�õ���DateFormat���е�format����
	 */
	
	public static void demo_2() {
		Date date=new Date();
		
		//��ȡ���ڸ�ʽ���󡣾�����Ĭ�ϵķ�� FULL��LONG�ȿ���ָ�����
		//DateFormat dateformat=DateFormat.getDateInstance(DateFormat.FULL);//2017��9��24�� ������
		DateFormat dateformat=DateFormat.getDateInstance(DateFormat.LONG);//2017��9��24��
		String str_date=dateformat.format(date);
		System.out.println(str_date);//2017-9-24
		
		
		//DateFormat dateformat1=DateFormat.getDateTimeInstance();//2017-9-24 9:22:32
		DateFormat dateformat1=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);//2017��9��24�� ����09ʱ23��24��
		String str_date1=dateformat1.format(date);
		System.out.println(str_date1);
		
		//���������Զ����  
		SimpleDateFormat sdate=new SimpleDateFormat("yyyy/MM/dd");
		String str_date2=sdate.format(date);
		System.out.println(str_date2);
		
	}

	/*
	 *���ڶ���-->����
	 *	getTime()
	 *����-->���ڶ���
	 *	1.ͨ�����ڶ���Ĺ��캯�� new Date(������)
	 * 	2.���ڶ���setTime()����;
	 * */
	public static void demo_1() {
		//����-->���ڶ���
		Date date=new Date(System.currentTimeMillis());
		System.out.println(date);//Sun Sep 24 09:13:46 CST 2017
		date=new Date(21383686189l);//ע������������l ��ʾ������
		System.out.println(date);
		//���ڶ���-->����
		Date date1=new Date();
		long ldate=date1.getTime();
		System.out.println(ldate);
		
	}
}
