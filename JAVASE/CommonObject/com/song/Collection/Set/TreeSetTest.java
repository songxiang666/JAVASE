package com.song.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

import com.song.Comparator.ComparatorByLength;

public class TreeSetTest {
	public static void main(String[] args){
		TreeSet ts=new TreeSet(new ComparatorByLength());
		ts.add("hauah");
		ts.add("loloolo");
		ts.add("lili"); //不允许有重复的值
		ts.add("aahaa");
		ts.add("abhhaa");
		ts.add("bhh");
		//TreeSet按照一定规律输出
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
