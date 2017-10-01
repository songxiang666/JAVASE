package com.song.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args){
		Collection coll=new ArrayList();
		show(coll);
	}

	public static void show(Collection coll) {
		coll.add("abc");
		coll.add("efg");
		coll.add("hij");
		
		//调用集合中的 iterator方法  获得一个迭代器对象
		//Iterator it=coll.iterator();
		
		//it.hasNext()  判断是否还有下一个
//		while(it.hasNext()){
//			System.out.println(it.next());
//		}
		  
		//通常一般开发中   这种方法  当for循环结束后     it迭代器能及时被回收  不会产生内存浪费  
		for(Iterator it=coll.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
