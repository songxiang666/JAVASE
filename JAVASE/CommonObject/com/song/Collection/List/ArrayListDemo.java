package com.song.Collection.List;

import java.util.ArrayList;
import java.util.Iterator;

import com.song.bean.Person;

public class ArrayListDemo {
	public static void main(String[] args){
		ArrayList al=new ArrayList();
		
		al.add(new Person("ËÎÏæ",19));
		al.add(new Person("Â·×Ó",18));
		al.add(new Person("ºüÀê",17));
		al.add(new Person("°ÂµÏ",16));
		
		Iterator it=al.iterator();
		while(it.hasNext()){
			Person p=(Person)it.next();
			System.out.println(p.getName()+"---"+p.getNum());
		}
	}
}
