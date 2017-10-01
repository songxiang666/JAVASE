package com.song.Collection.ToolClass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ToolClassDemo1 {
	public static void main(String[] args){
		demo_4();
	}

	public static void demo_4() {
		List<String> list=new ArrayList<String>();
		list.add("as1");
		list.add("ds2");
		list.add("cs3");
		list.add("bs4");
		list.add("fas5");
		
		System.out.println(list);
		//Collections.replaceAll(集合，old,new);
		Collections.replaceAll(list,"ds2","bs");
		System.out.println(list);
		
		//Collections.fill(list, "666");//将所有元素替换成同一个元素
		Collections.shuffle(list);//打乱顺序 随机生成
		System.out.println(list);
		
	}

	public static <T> void demo_2() {
		List<String> list=new ArrayList<String>();
		list.add("as1");
		list.add("ds2");
		list.add("cs3");
		list.add("bs4");
		list.add("aas5");
		
		//二分查找法
		//Collections.sort(list);
		//int n=Collections.binarySearch(list, "cs3");
		
		//查找最大值
		//方式一：String l=Collections.max(list);
		//方式二：String l=Collections.max(list, new ComparableByLength());
		System.out.println();
	}
	public static void demo_3(){
		
		//Collections.reverseOrder()  返回一个比较器
		
		//1.直接利用reverseOrder()方法：Set<String> set=new TreeSet<String>(Collections.reverseOrder());
		
//		2.创建一个匿名内部类：Set<String> set=new TreeSet<String>(new Comparator<String>(){
//
//			@Override
//			public int compare(String o1, String o2) {
//				int temp=o2.compareTo(o1);
//				return temp;
//			}
//			
//		});
		
		//3.传入一个自定义比较器：Set<String> set=new TreeSet<String>(new ComparableByLength());
		
		//4.反转比较器
		Set<String> set=new TreeSet<String>(Collections.reverseOrder(new ComparableByLength()));
													//反转比较器
		set.add("hjxs111");
		set.add("haxs1");
		set.add("hjxs11");
		set.add("hbxs1");
		System.out.println(set);
		
	}
	public static void demo_1() {
		List<String> list=new ArrayList<String>();
		list.add("as1");
		list.add("ds2");
		list.add("cs3");
		list.add("bs4");
		list.add("fas5");
		//对list集合进行排序
		//Collections.sort(list);
		//mysort(list);
		mysor1(list,new ComparableByLength());
		System.out.println(list);//[as1, bs4, cs3, ds2, fas5]
		
	}
	public static <T extends Comparable<? super T>> void mysort(List<T> list){
		for (int i = 0; i < list.size()-1; i++) {
			for(int j=i+1;j<list.size();j++){
				if(list.get(i).compareTo(list.get(j))>0)
					//swap()
					Collections.swap(list, i, j);
			}
		}
	}
	public static <T> void mysor1(List<T> list,Comparator<? super T> com){
		for (int i = 0; i < list.size()-1; i++) {
			for(int j=i+1;j<list.size();j++){
				if(com.compare(list.get(i), list.get(j))>0)
					//swap()
					Collections.swap(list, i, j);
			}
		}
	}
}
