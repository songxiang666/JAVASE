package com.song.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args){
		TreeSet ts=new TreeSet();
		ts.add("hauah");
		ts.add("lololo");
		ts.add("lilili"); //���������ظ���ֵ
		ts.add("aahhaa");
		ts.add("aahhaa");
		ts.add("aahhaa");
		//TreeSet����һ���������
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
