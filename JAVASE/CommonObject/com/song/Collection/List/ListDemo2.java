package com.song.Collection.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo2 {
	public static void main(String[] args){
		List li=new ArrayList();
		
		li.add("abc1");
		li.add("abc2");
		li.add("abc3");
		li.add("abc4");
		
		System.out.println(li);
		ListIterator lt=li.listIterator();
		//ListIterator  可以实现在迭代过程中对元素进行增删改查
		while(lt.hasNext()){
			Object obj=lt.next();
			if(obj.equals("abc2"))
				//lt.add("abc9");
				lt.set("abc9");
		}
		System.out.println("next:"+lt.hasNext());
		System.out.println("previous:"+lt.hasPrevious());
		System.out.println(li);
	/*	
		Iterator it=li.iterator();
		while(it.hasNext()){
			Object obj=it.next();//java.util.ConcurrentModificationException
			
			if(obj.equals("abc2"))
				li.add("abc9");
		//在迭代过程中 不要使用集合对元素进行操作 容易发生异常
			//可以使用Iterator接口中的子接口ListIterator来完成对元素的操作
			else
				System.out.println(obj);
		}*/
		
	}

	public static void show(List li) {
		// TODO Auto-generated method stub
		
	}
}
