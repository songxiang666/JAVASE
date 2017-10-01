package com.song.Collection.Set;

import java.util.HashSet;
import java.util.Iterator;

import com.song.bean.Person;

/*
 * 往hashset集合中存储Person对象 如果姓名和年龄相同 视为相同对象
 * 
 * */
public class HashSetTest {
	public static void main(String[] args){
		HashSet hs=new HashSet();
		
		//hashSet集合数据结构是哈希表 存储元素的时候使用元素的hashCode方法来确定位置
		//如果位置相同 再通过元素的equals方法来确定是否相同
//		hs.add(new Person("lili2",19));
		hs.add(new Person("lili5",13));
		hs.add(new Person("lili5",13));
		hs.add(new Person("lili8",15));
//		hs.add(new Person("lili8",15));
		
		Iterator it=hs.iterator();
		while(it.hasNext()){
			Person p=(Person)it.next();
			System.out.println(p.getName()+" -"+p.getNum());
		}
	}
}
