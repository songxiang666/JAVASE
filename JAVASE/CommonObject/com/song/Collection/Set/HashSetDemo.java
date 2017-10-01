package com.song.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args){
		HashSet hs=new HashSet();
		
		hs.add("hauah");
		hs.add("lololo");
		hs.add("lilili");
		hs.add("lilili");
		hs.add("lilili");
		hs.add("lilili");
		hs.add("lilili");
		hs.add("lilili"); //不允许有重复的值
		hs.add("aahhaa");
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		String str=new String("a");
		str.hashCode();
	}
}
