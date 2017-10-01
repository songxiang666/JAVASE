package com.song.Collection.List;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args){
		LinkedList link=new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		
//		System.out.println(link.getFirst());//获取第一个元素
//		System.out.println(link.getFirst());//获取第一个元素
//		
//		System.out.println(link.removeFirst());//获取第一个元素  并删除
//		
//		System.out.println(link.removeFirst());//获取第一个元素 并删除
		
		//不用迭代器 取出元素  前提是会删除
		while(!link.isEmpty()){
			System.out.println(link.removeLast());
		}//abc1 abc2 abc3 abc4
		System.out.println(link);//[]
	
	}
}
