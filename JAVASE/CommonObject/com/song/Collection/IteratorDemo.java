package com.song.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args){
		Collection coll=new ArrayList();
		show(coll);
	}

	public static void show(Collection coll) {
		coll.add("abc");
		coll.add("efg");
		coll.add("hij");
		
		//���ü����е� iterator����  ���һ������������
		//Iterator it=coll.iterator();
		
		//it.hasNext()  �ж��Ƿ�����һ��
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		  
		//ͨ��һ�㿪����   ���ַ���  ��forѭ��������     it�������ܼ�ʱ������  ��������ڴ��˷�  
		for(Iterator it=coll.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
