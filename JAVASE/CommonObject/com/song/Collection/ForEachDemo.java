package com.song.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	public static void main(String[] args){
		/*
		 *forEach��䣺
		 *��ʽ��
		 *	for(���� ������Collection����|����)
		 *	{
		 *	
		 *	}
		 *
		 *	��ͳfor�͸߼�for������
		 *		��ͳfor���Զ������ѭ����������ѭ����������
		 *		
		 *		�߼�for��һ�ֵļ���ʽ  �������б�������Ŀ�ꡣҪô�����飬Ҫô��Collection���м���
		 *		
		 *		������ı�����������ǻ�ȡ����Ԫ��  ����ʹ�ø߼�for
		 *		
		 */
		List<String> list=new ArrayList<String>();
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		//������ÿ��Ԫ�� ����
		for(String s:list){//����д
			System.out.println(s);
		}
		
		int[] arr={3,2,5,4,7,6};
		for(int i:arr){
			System.out.println(i);
		}
		
		//����ʹ�ø߼�for����map������
		//����ֱ����  ���ǿ��Խ�mapת�ɵ��еļ��ϾͿ�����
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(3,"zhansan");
		map.put(1,"wanyi");
		map.put(7,"wanwuliu");
		map.put(4,"xbh");
		
		for(Integer key:map.keySet()){
			String value=map.get(key);
			System.out.println(key+":"+value);
		}
		
		for(Map.Entry<Integer, String> me:map.entrySet()){
			Integer key=me.getKey();
			String value=me.getValue();
			System.out.println(key+":"+value);
		}
	}
}
