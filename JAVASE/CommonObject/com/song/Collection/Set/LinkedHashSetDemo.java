package com.song.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args){
		HashSet hs=new LinkedHashSet();
		
		hs.add("hauah");
		hs.add("lololo");
		hs.add("lilili"); //不允许有重复的值
		hs.add("aahhaa");
		hs.add("aahhaa");
		hs.add("aahhaa");
		//输出是有序的  也是唯一的
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
