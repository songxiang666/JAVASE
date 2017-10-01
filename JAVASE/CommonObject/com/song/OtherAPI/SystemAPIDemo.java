package com.song.OtherAPI;

import java.util.Properties;
import java.util.Set;

public class SystemAPIDemo {
	public static void main(String[] args){
		/*
		 * System:类中的方法和属性都是静态的
		 * 
		 * 常见方法：
		 * 	long currentTimeMillis()
		 * 
		 * */
		//long l1=System.currentTimeMillis();
		//System.out.println(l1);
		//demo_1();
		//获取到当前任何系统的换行符
		System.out.println("Hello-"+System.getProperty("line.separator")+"world");
	
	}

	public static void demo_1() {
		/*获取系统的属性信息，并存储到了Properties集合中*/
		/*
		 * Properties集合存储都是String类型的键和值
		 * 最好使用它自己的存储和取出的方法来完成元素的操作。
		 * */
		Properties prop=System.getProperties();
		
		Set<String> nameSet=prop.stringPropertyNames();
		
		for(String name:nameSet){
			String value=prop.getProperty(name);
			System.out.println(name+"::"+value);
		}
		
	}
}
