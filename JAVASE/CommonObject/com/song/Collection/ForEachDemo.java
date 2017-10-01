package com.song.Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
	public static void main(String[] args){
		/*
		 *forEach语句：
		 *格式：
		 *	for(类型 变量：Collection集合|数组)
		 *	{
		 *	
		 *	}
		 *
		 *	传统for和高级for的区别
		 *		传统for可以定义控制循环的增量和循环结束条件
		 *		
		 *		高级for是一种的简化形式  它必须有被遍历的目标。要么是数组，要么是Collection单列集合
		 *		
		 *		对数组的遍历如果仅仅是获取数组元素  可以使用高级for
		 *		
		 */
		List<String> list=new ArrayList<String>();
		
		list.add("abc1");
		list.add("abc2");
		list.add("abc3");
		list.add("abc4");
		
		//遍历出每个元素 迭代
		for(String s:list){//简化书写
			System.out.println(s);
		}
		
		int[] arr={3,2,5,4,7,6};
		for(int i:arr){
			System.out.println(i);
		}
		
		//可以使用高级for遍历map集合吗？
		//不能直接用  但是可以将map转成单列的集合就可以了
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
