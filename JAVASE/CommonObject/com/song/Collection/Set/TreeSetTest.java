package com.song.Collection.Set;

import java.util.Iterator;
import java.util.TreeSet;

import com.song.Comparator.ComparatorByLength;

public class TreeSetTest {
	public static void main(String[] args){
		TreeSet ts=new TreeSet(new ComparatorByLength());
		ts.add("hauah");
		ts.add("loloolo");
		ts.add("lili"); //���������ظ���ֵ
		ts.add("aahaa");
		ts.add("abhhaa");
		ts.add("bhh");
		//TreeSet����һ���������
		Iterator it=ts.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
