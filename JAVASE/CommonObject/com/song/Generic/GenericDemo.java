package com.song.Generic;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericDemo {
	public static void main(String[] args){
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("abc1");
		al.add("abc1");
		al.add("abc2");
		al.add("abc1");
		al.add("abc3");
		al.add("hahah");//抛出java.lang.ClassCastException异常
			//在集合上面添加的泛型之后 将执行期间抛出的异常  变成了编译时期的异常
		//由此推出了泛型技术
		Iterator<String> it=al.iterator();
		//在迭代器上添加泛型   避免强制转换
		while(it.hasNext()){
			String s=it.next();
			System.out.println(s);
		}
	}
}
