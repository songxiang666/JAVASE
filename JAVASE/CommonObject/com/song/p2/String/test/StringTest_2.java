package com.song.p2.String.test;
//一个子串在整串中出现的次数
/*
 * 思路：
 * 1.要找的子串是否存在，如果存在获取其出现的位置，用indexof()
 * 2.设置一个计数器 +1 
 * 3.接着往下找   下一次开始查找的位置  上次出现的位置+要查找字符串的长度 
 * 4.结束条件 当上次出现的位置+要查找字符串的长度=父串的长度时  退出循环
 * */
public class StringTest_2 {
	public static void main(String[] args){
		String s="nasvbuhnabducjnahxudinna";
		String key="na";
		
		int count=getKeyStringCOunt(s,key);
		System.out.println(count);
		//getKeyStringCount(s,key);
	}
	/**
	 * 获取子字符串在整串中出现次数 采用indexOf()方法 和 subString()方法吗此方法有个缺陷 造成常量池中字符串多余
	 * @param s
	 * @param key
	 * @return
	 */
	public static int getKeyStringCount(String s, String key) {
		//定义计数器
		int count=0;
		
		//定义查找的位置
		int index=0;
		
		while((index=s.indexOf(key))!=-1){
			
			s=s.substring(index+key.length());
			
			count++;
		}
		
		return count;
	}
	/**
	 * 获取子字符串在整串中出现次数 采用indexOf()方法
	 * @param s
	 * @param key
	 * @return count
	 */
	public static int getKeyStringCOunt(String s, String key) {
		//1.定义计数器
		int count=0;
		
		//2.定义记录位置
		int index=0;
		
		while((index=s.indexOf(key,index))!=-1){//要知道 当indexOf(key,findIndex) 中的findIndex>整串的长度时 直接返回-1
			
				index=index+key.length();
				count++;
		}
		return count;
	}
}
