package com.song.Collection.List;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
	public static void main(String[] arg){
		List li=new ArrayList();
		show(li);
	}

	public static void show(List li) {
		li.add("abc1");
		li.add("abc2");
		li.add("abc3");
		li.add("abc4");
		
		//ָ��λ�ò���Ԫ��
//		li.add(2,"hhh");
//		System.out.println(li);//[abc1, abc2, hhh, abc3, abc4]
		
		//ɾ��Ԫ��
		//System.out.println(li.remove(2));//abc3
		
		//�޸�Ԫ��
		System.out.println(li.set(0, "songxiang"));
		
		//��ȡԪ��
		System.out.println("get:"+li.get(0));
		System.out.println(li);
		
		
	}
}
