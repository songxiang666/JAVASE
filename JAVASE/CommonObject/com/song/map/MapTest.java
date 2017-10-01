package com.song.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * 练习：
 * "fadnjkdscfsaxdsdxxa"获取该字符串中 每一个字母出现的次数
 * 要求打印结果是a(2) b(1)... 
 *  思路：
 *  1.将字符串打碎成数组
 *  2.创建一个Map容器  TreeMap  
 *  3.判断集合中是否存在"a"键  没有  存入键值对 "a" - 1
 *  				       有   取出之前"a"的值  将值++  再存入"a" -值
 *  4.一直循环  直到字符数组   循环完毕  
 * */
public class MapTest {
	public static void main(String[] args){
		String s="fa  68 -vgsafgsdfhaafs";
		
		String a=getCharCount(s);
		System.out.println(a);
	}
	/**
	 * 获取字符串中每个字符出现的次数
	 * @param s
	 * @return str
	 * */
	public static String getCharCount(String s) {
		char[] arr=s.toCharArray();
		int count=1;
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for(int i=0;i<arr.length;i++){
			if(!(arr[i]>='a'&&arr[i]<='z'||arr[i]>='A'&&arr[i]<='Z'))
				continue;
			Integer value=map.get(arr[i]);
			if(value!=null)
				count=value+1;
			map.put(arr[i], count);
		}

		return mapToString(map);
	}
	public static String mapToString(Map<Character, Integer> map) {
		StringBuilder sb=new StringBuilder();
		Iterator<Map.Entry<Character,Integer>> it=map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Character,Integer> me=it.next();
			Character ch=me.getKey();
			Integer a=me.getValue();
			sb.append(ch+"("+a+") ");
		}
		return sb.toString();
	}
}
