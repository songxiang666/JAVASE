package com.song.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

import com.song.bean.Person;

public class ArrayListDemo {
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		
		al.add(new Person("����",19));
		al.add(new Person("·��",18));
		al.add(new Person("����",17));
		al.add(new Person("�µ�",16));
		
		Iterator it=al.iterator();
		while(it.hasNext()){
			Person p=(Person)it.next();
			System.out.println(p.getName()+"---"+p.getNum());
		}
	}
}
