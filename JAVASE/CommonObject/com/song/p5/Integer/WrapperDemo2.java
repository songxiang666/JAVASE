package com.song.p5.Integer;

public class WrapperDemo2 {
	public static void main(String[] args){
		Integer i=4;//i=new Integer(4)  自动装箱，简化书写
		i=i+6;//i=new Integer(i.intValue()+6); i.intValue();  自动拆箱
		
		//自动拆箱装箱 缺点    当Integer i=null 进行自动装箱时  拆箱时会出错 i.intValue() 会报错  所以需要我们手动判断  
		
		int num=4;
		num=num+5;
		
		
		//-------------面试题--------------------
		Integer x= new Integer(127);
		Integer y=new Integer(127);
		
		System.out.println(x==y);//false
		System.out.println(x.equals(y));//true
		
		Integer a=127;
		Integer b=127;//jdk1.5以后   如果自动装箱是一个字节  该数据会被共享 不会 重新开辟空间
		System.out.println(a==b);//true
	}
}
