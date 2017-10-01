package com.song.p1.String.demo;

public class StringDemo {
		
	public static void main(String[] args){
		/*
		 * String类的特点：
		 * 字符串对象一旦被初始化就不会被改变
		 */
		stringDemo2();
	}
	public  static void stringDemo2() {
		// TODO Auto-generated method stub
		String s="abc";//在常量池中创建了一个字符串对象 
		String s1=new String("abc");//在堆内存中创建一个字符串对象  并将"abc"字符串对象传给构造函数
		
		System.out.println(s==s1);//false
		
		System.out.println(s.equals(s1));//true 
		//String中的equals复写了Object中的equals  String中的equals比较的是字符串内容是否相同
		System.out.println(s1 instanceof String);//true
//		System.out.println("s="+s);
//		System.out.println("s1="+s1);
		//alt+ctrl+方向键下  将这一行向下复制
		
		//String类的equals方法
		/*
		 * 1.如果两个对象指向同一个引用，直接返回true
		 * 2.判断传入的对象是否是String类型
		 * 	2.1判断这两个字符串底层char数组的长度是否一致
		 * 	2.2循环判断底层数组里的每一个char字符，看值是否相等
		 * 	2.3满足 返回true
		 * 3.不满足 返回false;
		 */
		
	}
	/**
	 * 演示字符串定义的第一种方式，并明确字符串常量池
	 * 池中没有就建立 池中有，直接用
	 */
	private static void stringDemo1() {
		String s=String.valueOf("abc");//'abc'存储在字符串常量池中
		String s1=String.valueOf("abc");
		System.out.println(s==s1);//true
	}	
}
