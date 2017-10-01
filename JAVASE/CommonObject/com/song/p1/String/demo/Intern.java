package com.song.p1.String.demo;

public class Intern {
	public static void main(String[] args){
		String s1=new String("abc");
		String s2=s1.intern();//找到常量池中的"abc" 
		String s3="abc";
		System.out.println(s2==s1);
		System.out.println(s2==s3);
	}
}
