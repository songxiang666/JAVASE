package com.song.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

import com.song.Comparator.ComparatorName;
import com.song.bean.Person;

public class TreeSetDemo3 {
	public static void main(String[] args){
		TreeSet ts=new TreeSet(new ComparatorName());
		
		ts.add(new Person("李四",12));
		ts.add(new Person("宋湘",18));
		ts.add(new Person("王五",45));
		ts.add(new Person("王六",45));
		ts.add(new Person("李四",27));
		ts.add(new Person("库四",27));
		//TreeSet按照一定规律输出
		
		//要求  按照每个元素对象的年龄大小进行存储
		Iterator it=ts.iterator();
		
		while(it.hasNext()){
			Person p=(Person)it.next();
			
			System.out.println(p.getName()+"~"+p.getNum());
			
		}
	}
}
