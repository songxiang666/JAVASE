package com.song.Collection;
import java.util.ArrayList;
import java.util.Collection;


public class CollectionDemo {
	public static void main(String[] args){
		Collection coll=new ArrayList();
		show(coll);//[abc, efg, hij]
	}
	public static void show(Collection coll){//ctrl+shift+o 自动导入包
		//添加
		coll.add("abc");
		coll.add("efg");
		coll.add("hij");
		System.out.println(coll);
		//删除
		coll.remove("efg"); //会改变集合长度
		System.out.println(coll);//[abc, hij]
		//清空集合
		//coll.clear();
		
		System.out.println(coll.contains("efg"));//[]
	}
}
