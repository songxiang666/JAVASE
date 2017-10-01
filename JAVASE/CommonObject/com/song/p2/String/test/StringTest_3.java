package com.song.p2.String.test;
//两个字符串中最大相同的子串。
/*
 * 
 * 
 * */
public class StringTest_3 {
	public static void main(String[] args){
		String s1="songxiangnihengmei";
		String s2="xuenihengmeima";
		
		String s=getMaxSubString(s1,s2);
		System.out.println(s);
	}
	/**
	 * 获得最大子串
	 * @param s1
	 * @param s2
	 * @return
	 */
	public static String getMaxSubString(String s1, String s2) {
		//判断谁长 谁短
		String max = null,min = null;
		max=(s1.length()>s2.length())? s1:s2;
		min=max.equals(s1)? s2:s1;
		
		for(int i=0;i<min.length();i++){//外层循环用于控制s2要缩短的长度
						//内层循环 控制 下次查找字符串的x:起始下标  z:子串长度
			for(int x=0,z=min.length()-i;z!=min.length()+1;x++,z++){
				
				String s=min.substring(x,z);
				if(max.contains(s)){
					return s;
				}
			}
			
		}
		
		return null;
	}
}
