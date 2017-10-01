package com.song.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

import com.song.bean.Person;

public class HashMapDemo {
	public static void main(String[] args){
		/*将学生对象和学生的归属地通过键与值存储到Map集合中
		 * */
		HashMap<Person,String> hm=new HashMap<Person,String>();
		
		hm.put(new Person("lisi",38),"Beijin");
		hm.put(new Person("zhaoliu",30),"xiangtan");
		hm.put(new Person("dede",27),"shanghai");
		hm.put(new Person("songxiang",36),"Lundun");
		hm.put(new Person("songxiang",36),"Liuyang");
		
		Set<Person> key=hm.keySet();
		Iterator<Person> it=key.iterator();
		while(it.hasNext()){
			Person i=it.next();
			String value=hm.get(i);
			System.out.println(i+"..."+value);
		}
	}
}
