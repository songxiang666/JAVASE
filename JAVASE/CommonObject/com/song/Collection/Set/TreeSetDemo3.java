package com.song.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

import com.song.Comparator.ComparatorName;
import com.song.bean.Person;

public class TreeSetDemo3 {
	public static void main(String[] args){
		TreeSet ts=new TreeSet(new ComparatorName());
		
		ts.add(new Person("����",12));
		ts.add(new Person("����",18));
		ts.add(new Person("����",45));
		ts.add(new Person("����",45));
		ts.add(new Person("����",27));
		ts.add(new Person("����",27));
		//TreeSet����һ���������
		
		//Ҫ��  ����ÿ��Ԫ�ض���������С���д洢
		Iterator it=ts.iterator();
		
		while(it.hasNext()){
			Person p=(Person)it.next();
			
			System.out.println(p.getName()+"~"+p.getNum());
			
		}
	}
}
