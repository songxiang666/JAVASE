package com.song.Generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.song.bean.Person;
import com.song.bean.Tool;

public class GeneticDefineDemo {
	public static void main(String[] args){
		Tool<Person> t=new Tool<Person>();
		t.setQ(new Person());
		Person p=t.getQ();
		
		Tool<String> t1=new Tool<String>();
		t1.setQ("huahu");
		t1.show("sjk");
		t1.print("cdvv");
		
		ArrayList<Integer> t2=new ArrayList<Integer>();
		t2.add(12);
		t2.add(4);
		
		printCollection(t2);
	}//自定义泛型类
	
	/**
	 * 迭代并打印集合中的元素
	 * 
	 * */
	
	public static void printCollection(Collection<?> t1) {
		Iterator<?> it=t1.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
