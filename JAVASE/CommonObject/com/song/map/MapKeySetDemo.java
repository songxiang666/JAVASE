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
		//���ȡ��map�е�Ԫ��
		//2.ͨ��keyset������ȡMap�����еļ����ڵ�set���ϣ���ͨ��set��������ȡ��ÿһ����
		//2.�ٶ�ÿһ����ͨ��Map���ϵ�get������ȡ�����Ӧ��ֵ����
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
