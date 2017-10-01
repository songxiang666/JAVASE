package com.song.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args){
		Map<Integer,String> map=new HashMap<Integer,String>();
		method(map);
	}
	public static void method(Map<Integer,String> map){
		System.out.println(map.put(8, "旺财"));//null
		System.out.println(map.put(8, "小强"));//旺财  存相同键， 值会覆盖
		map.put(2, "cd");
		map.put(7, "dd");
		
		//System.out.println("remove:"+map.remove(2));
		System.out.println("containsKey:"+map.containsKey(2));
		System.out.println("get:"+map.get(7));
		//System.out.println(map.size());
		System.out.println(map);
		
	}
}
