package com.song.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapValueDemo {
	public static void main(String[] args){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1, "hudhd1");
		map.put(2, "hudhd2");
		map.put(3, "hudhd3");
		map.put(4, "hudhd4");
		
		Method(map);
	}

	public static void Method(Map<Integer, String> map) {
		Collection<String> values=map.values();
		
		Iterator<String> it=values.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
	}
}
