package com.song.p1.String.demo;

public class StringDemo {
		
	public static void main(String[] args){
		/*
		 * String����ص㣺
		 * �ַ�������һ������ʼ���Ͳ��ᱻ�ı�
		 */
		stringDemo2();
	}
	public  static void stringDemo2() {
		// TODO Auto-generated method stub
		String s="abc";//�ڳ������д�����һ���ַ������� 
		String s1=new String("abc");//�ڶ��ڴ��д���һ���ַ�������  ����"abc"�ַ������󴫸����캯��
		
		System.out.println(s==s1);//false
		
		System.out.println(s.equals(s1));//true 
		//String�е�equals��д��Object�е�equals  String�е�equals�Ƚϵ����ַ��������Ƿ���ͬ
		System.out.println(s1 instanceof String);//true
//		System.out.println("s="+s);
//		System.out.println("s1="+s1);
		//alt+ctrl+�������  ����һ�����¸���
		
		//String���equals����
		/*
		 * 1.�����������ָ��ͬһ�����ã�ֱ�ӷ���true
		 * 2.�жϴ���Ķ����Ƿ���String����
		 * 	2.1�ж��������ַ����ײ�char����ĳ����Ƿ�һ��
		 * 	2.2ѭ���жϵײ��������ÿһ��char�ַ�����ֵ�Ƿ����
		 * 	2.3���� ����true
		 * 3.������ ����false;
		 */
		
	}
	/**
	 * ��ʾ�ַ�������ĵ�һ�ַ�ʽ������ȷ�ַ���������
	 * ����û�оͽ��� �����У�ֱ����
	 */
	private static void stringDemo1() {
		String s=String.valueOf("abc");//'abc'�洢���ַ�����������
		String s1=String.valueOf("abc");
		System.out.println(s==s1);//true
	}	
}
