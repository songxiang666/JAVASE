package com.song.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args){
		HashSet hs=new LinkedHashSet();
		
		hs.add("hauah");
		hs.add("lololo");
		hs.add("lilili"); //���������ظ���ֵ
		hs.add("aahhaa");
		hs.add("aahhaa");
		hs.add("aahhaa");
		//����������  Ҳ��Ψһ��
		Iterator it=hs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}
