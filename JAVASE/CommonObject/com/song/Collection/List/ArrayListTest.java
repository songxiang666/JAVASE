package com.song.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

import com.song.bean.Person;

import edu.princeton.cs.algs4.StdOut;

public class ArrayListTest {
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		
//		al.add("abc1");
//		al.add("abc1");
//		al.add("abc2");
//		al.add("abc1");
//		al.add("abc3");
		
		al.add(new Person("����",19));
		al.add(new Person("·��",18));
		al.add(new Person("����",17));
		al.add(new Person("�µ�",16));
		al.add(new Person("����",17));
		al.add(new Person("�µ�",16));
		
		
		System.out.println(al);
		
		al=getSingleElementList(al);
		
		System.out.println(al.remove(new Person("�µ�",16)));
		System.out.println(al);
		StdOut.println(al);
	}

	public static ArrayList singleElement_2(ArrayList al) {
		
		return null;
	}

	public static ArrayList getSingleElementList(ArrayList al) {
		//1.����һ��������
		ArrayList temp=new ArrayList();
		//2.����al����
		Iterator it=al.iterator();
		while(it.hasNext()){
			Object obj=it.next();
			if(!temp.contains(obj)){
				temp.add(obj);
			}
		}
		return temp;
	}
}
