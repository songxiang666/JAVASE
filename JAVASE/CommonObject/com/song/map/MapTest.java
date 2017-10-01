package com.song.map;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/*
 * ��ϰ��
 * "fadnjkdscfsaxdsdxxa"��ȡ���ַ����� ÿһ����ĸ���ֵĴ���
 * Ҫ���ӡ�����a(2) b(1)... 
 *  ˼·��
 *  1.���ַ������������
 *  2.����һ��Map����  TreeMap  
 *  3.�жϼ������Ƿ����"a"��  û��  �����ֵ�� "a" - 1
 *  				       ��   ȡ��֮ǰ"a"��ֵ  ��ֵ++  �ٴ���"a" -ֵ
 *  4.һֱѭ��  ֱ���ַ�����   ѭ�����  
 * */
public class MapTest {
	public static void main(String[] args){
		String s="fa  68 -vgsafgsdfhaafs";
		
		String a=getCharCount(s);
		System.out.println(a);
	}
	/**
	 * ��ȡ�ַ�����ÿ���ַ����ֵĴ���
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
