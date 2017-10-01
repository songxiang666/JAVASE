package com.song.Collection.List;

import java.util.LinkedList;

/*
 * 请使用LinkedList 来模拟一个堆栈或者队列数据结构   面试题  ！！！
 * 						
 * 注意：我们应该描述这样的容器  而不是单纯的输入输出
 * 
 * */
class Qeuen{
	private LinkedList link;
	
	public Qeuen(){
		link=new LinkedList();
	}
	
	/**
	 * 队列的添加元素
	 * */
	public void myAdd(Object obj){
		link.addFirst(obj);
	}
	public Object get(){
		return link.removeLast() ;
	}
	public boolean isEmpty(){
		return link.isEmpty();
	}
}
public class LinkedListTest {
	public static void main(String[] args){
		Qeuen q=new Qeuen();
		q.myAdd("abc1");
		q.myAdd("abc2");
		q.myAdd("abc3");
		q.myAdd("abc4");
		
		while(!q.isEmpty()){
			System.out.println(q.get());
		}
	}
}
