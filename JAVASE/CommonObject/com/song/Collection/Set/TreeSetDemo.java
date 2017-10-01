package com.song.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args){
		TreeSet ts=new TreeSet();
		ts.add("hauah");
		ts.add("lololo");
		ts.add("lilili"); //不允许有重复的值
		ts.add("aahhaa");
		ts.add("aahhaa");
		ts.add("aahhaa");
		//TreeSet按照一定规律输出
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
