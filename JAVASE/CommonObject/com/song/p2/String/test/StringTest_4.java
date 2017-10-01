package com.song.p2.String.test;
//模拟一个trim功能一致的方法。
/*
 *1.定义两个变量
 * 一个变量作为从头开始判断字符串空格的角标
 * 一个变量作为从尾开始判断字符串空格的角标
 *2.判断到不是空格为止，取头尾之间的字符串即可
 * 
 * */
public class StringTest_4 {
	public static void main(String[] args){
		String s="   ab c   ";
		System.out.println("-"+s+"-");
		s=toTrim(s);
		System.out.println("-"+s+"-");
		
	}
	/**
	 * 一个与trim()方法相似功能的方法  去掉字符串两端的空格
	 * @param s
	 * @return
	 */
	public static String toTrim(String s) {
		int start=0,end=s.length()-1;
		
		while(start<end&&s.charAt(start)==' '){
			start++;
		}
		while(start<end&&s.charAt(end)==' '){
			end--;
		}
		return s.substring(start,end+1);
	}
}
