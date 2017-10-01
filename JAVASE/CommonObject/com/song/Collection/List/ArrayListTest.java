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
		
		al.add(new Person("ËÎÏæ",19));
		al.add(new Person("Â·×Ó",18));
		al.add(new Person("ºüÀê",17));
		al.add(new Person("°ÂµÏ",16));
		al.add(new Person("ºüÀê",17));
		al.add(new Person("°ÂµÏ",16));
		
		
		System.out.println(al);
		
		al=getSingleElementList(al);
		
		System.out.println(al.remove(new Person("°ÂµÏ",16)));
		System.out.println(al);
		StdOut.println(al);
	}

	public static ArrayList singleElement_2(ArrayList al) {
		
		return null;
	}

	public static ArrayList getSingleElementList(ArrayList al) {
		//1.´´½¨Ò»¸öÁÙÈÝÆ÷
		ArrayList temp=new ArrayList();
		//2.µü´úalÈÝÆ÷
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
