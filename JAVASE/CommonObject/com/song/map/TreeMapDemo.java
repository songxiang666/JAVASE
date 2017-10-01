package com.song.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.song.bean.Person;

public class TreeMapDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Person,String> tm=new TreeMap<Person,String>();
		tm.put(new Person("lisi",38),"Beijin");
		tm.put(new Person("zhaoliu",30),"xiangtan");
		tm.put(new Person("dede",27),"shanghai");
		tm.put(new Person("songxiang",36),"Lundun");
		tm.put(new Person("songxiang",36),"Liuyang");
		
		Set<Map.Entry<Person, String>> s=tm.entrySet();
		Iterator<Map.Entry<Person, String>> it=s.iterator();
		while(it.hasNext()){
			Map.Entry<Person, String> me=it.next();
			String value=me.getValue();
			Person key=me.getKey();
			System.out.println(key+"..."+value);
		}

	}

}
