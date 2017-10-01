package com.song.Collection;
import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo01 {
	public static void main(String[] args){
		Collection coll1=new ArrayList();
		Collection coll2=new ArrayList();
		show(coll1,coll2);
	}

	public static void show(Collection coll1, Collection coll2) {
		coll1.add("abc1");
		coll1.add("abc2");
		coll1.add("abc3");
		coll1.add("abc4");
		
		coll2.add("abc2");
		coll2.add("abc5");
		coll2.add("abc6");
		//addAll();
		//coll1.addAll(coll2);
		
		//removeAll();
		//coll1.removeAll(coll2);//删除了与coll2中相同的元素
		
		//retainAll();
		coll1.retainAll(coll2);//保留了与coll2中相同的元素
		System.out.println(coll1+" "+coll2);
		
	}
}
