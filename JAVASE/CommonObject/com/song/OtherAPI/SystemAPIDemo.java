package com.song.OtherAPI;

import java.util.Properties;
import java.util.Set;

public class SystemAPIDemo {
	public static void main(String[] args){
		/*
		 * System:���еķ��������Զ��Ǿ�̬��
		 * 
		 * ����������
		 * 	long currentTimeMillis()
		 * 
		 * */
		//long l1=System.currentTimeMillis();
		//System.out.println(l1);
		//demo_1();
		//��ȡ����ǰ�κ�ϵͳ�Ļ��з�
		System.out.println("Hello-"+System.getProperty("line.separator")+"world");
	
	}

	public static void demo_1() {
		/*��ȡϵͳ��������Ϣ�����洢����Properties������*/
		/*
		 * Properties���ϴ洢����String���͵ļ���ֵ
		 * ���ʹ�����Լ��Ĵ洢��ȡ���ķ��������Ԫ�صĲ�����
		 * */
		Properties prop=System.getProperties();
		
		Set<String> nameSet=prop.stringPropertyNames();
		
		for(String name:nameSet){
			String value=prop.getProperty(name);
			System.out.println(name+"::"+value);
		}
		
	}
}
