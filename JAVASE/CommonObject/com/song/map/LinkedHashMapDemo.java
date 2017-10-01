package com.song.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	public static void main(String[] args){
		Map<Integer,String> map=new LinkedHashMap<Integer, String>();
		map.put(3, "liul4");
		map.put(5, "liul3");
		map.put(1, "liul2");
		map.put(0, "liul1");
		
		Iterator<Map.Entry<Integer,String>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, String> me=it.next();
			Integer key=me.getKey();
			String value=me.getValue();
			System.out.println(key+" --"+value);
		}
		
	}
}
