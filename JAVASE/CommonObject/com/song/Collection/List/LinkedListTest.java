package com.song.Collection.List;

import java.util.LinkedList;

/*
 * ��ʹ��LinkedList ��ģ��һ����ջ���߶������ݽṹ   ������  ������
 * 						
 * ע�⣺����Ӧ����������������  �����ǵ������������
 * 
 * */
class Qeuen{
	private LinkedList link;
	
	public Qeuen(){
		link=new LinkedList();
	}
	
	/**
	 * ���е����Ԫ��
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
