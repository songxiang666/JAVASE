package com.song.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEntrySet {
	public static void main(String[] args){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "hudhd1");
		map.put(2, "hudhd2");
		map.put(3, "hudhd3");
		map.put(4, "hudhd4");
		
		Method(map);
	}

	public static void Method(Map<Integer, String> map) {
		/*
		 *entrySet
		 *�÷���������ֵ�Ĺ�ϵ��Ϊ����洢����set�����У������ӳ���ϵ�����;���Map.Entry���� 
		 * */
		Set<Map.Entry<Integer,String>> entrySet=map.entrySet();
		
		Iterator<Map.Entry<Integer,String>> it=entrySet.iterator();
		
		while(it.hasNext()){
			Map.Entry<Integer, String> me=it.next();
			Integer key=me.getKey();
			String value=me.getValue();
			System.out.println(key+":::"+value);
		}
	}
}
