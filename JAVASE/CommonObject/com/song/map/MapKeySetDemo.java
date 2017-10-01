package com.song.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapKeySetDemo {
	public static void main(String[] args){
		Map<Integer,String> map=new HashMap<Integer,String>();;
		method(map);
		methodKeySet(map);
	}
	public static void methodKeySet(Map<Integer,String> map){
		//如何取出map中的元素
		//2.通过keyset方法获取Map中所有的键所在的set集合，再通过set迭代器获取到每一个键
		//2.再对每一个键通过Map集合的get方法获取到其对应的值即可
		Set<Integer> keyset=map.keySet();
		Iterator<Integer> it=keyset.iterator();
		while(it.hasNext()){
			System.out.println(map.get(it.next()));
		}
	}
	public static void method(Map<Integer, String> map) {
		System.out.println(map.put(8,"wangdi"));
		System.out.println(map.put(8,"xiangqiang"));
		System.out.println(map.put(2,"zhangsan"));
		System.out.println(map.put(7,"zhouliu"));
	}
}
