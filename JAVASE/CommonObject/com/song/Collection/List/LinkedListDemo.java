package com.song.Collection.List;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args){
		LinkedList link=new LinkedList();
		
		link.addFirst("abc1");
		link.addFirst("abc2");
		link.addFirst("abc3");
		link.addFirst("abc4");
		
//		System.out.println(link.getFirst());//��ȡ��һ��Ԫ��
//		System.out.println(link.getFirst());//��ȡ��һ��Ԫ��
//		
//		System.out.println(link.removeFirst());//��ȡ��һ��Ԫ��  ��ɾ��
//		
//		System.out.println(link.removeFirst());//��ȡ��һ��Ԫ�� ��ɾ��
		
		//���õ����� ȡ��Ԫ��  ǰ���ǻ�ɾ��
		while(!link.isEmpty()){
			System.out.println(link.removeLast());
		}//abc1 abc2 abc3 abc4
		System.out.println(link);//[]
	
	}
}
