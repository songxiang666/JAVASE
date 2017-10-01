package com.song.p1.String.demo;

public class Equals {
	public static void main(String[] args){
		Integer itr=new Integer("123");
		Long lon=new Long("123");
		System.out.println(itr.equals(lon));//false
		//在Integer类中复写了equals方法  先判断该对象是不是Integer类的实例 如果是 再比较数值
		
		Person p1=new Person("张三");
		Person p2=new Person("张三");
		System.out.println(p1.equals(p2));//false  
		//由于在Person类中并未复写 Object中的equals 方法  所以用的是Object中的equals 其比较的是地址值
	}
}
class Person{
	private String name;
	public Person(String name){
		this.name=name;
	}
}