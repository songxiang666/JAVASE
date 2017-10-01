package com.song.p5.Integer;

public class IntegerDemo02 {
	public static void main(String[] args){
		Integer a=new Integer("23");
		Integer b=new Integer(23);
		
		System.out.println(a==b);//false
		System.out.println(a.equals(b));//true
		
		//判断两个数字对象的大小  compareTo(b);  a<b  返回-1 a>b 1  a=b 0
		System.out.println(a.compareTo(b));//0
		 
		
		
	}
}
