package com.song.bean;

import java.io.Serializable;

public class Person implements Comparable,Serializable{
	private String name;
	private int num;
	
	public Person() {
		super();
	}
	public Person(String name, int num) {
		super();
		this.name = name;
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public boolean equals(Object obj) {
		if(this==obj)
			return true;
		if(!(obj instanceof Person ))
			throw new ClassCastException("类型错误");
		Person p=(Person)obj;
		return this.name.equals(p.name)&&this.num==p.num;
	}
	@Override
	public int hashCode() {
		return num+name.hashCode();
		//return 100;
	}
	@Override
	public String toString() {
		return "name:"+this.name+" age:"+this.num;
	}
	@Override
	public int compareTo(Object o) {
		Person p=(Person)o;
		
		//自认为很美的代码
		//先年龄排序 再对姓名排序
		int temp =this.num-p.num;
		return temp==0?this.name.compareTo(p.name):temp;
		
		//先姓名排序 再年龄
		/*int temp=this.name.compareTo(p.name);
		 *return temp==0? this.age-p.age:temp;
		 * 
		 * */
	/*	if(this.num>p.num){
			return 1;
		}
		else if(this.num<p.num){
			return -1;
		}
		else{
			return this.name.compareTo(p.name);
		}*/
	}
	
}
