package com.song.Collection.ToolClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToolClassArrays {
	public static void main(String[] args){
		/*
		 * Arrays中的方法都是静态的
		 * */
		//int[] arr={12,3,76,43,5};
		//System.out.println(Arrays.toString(arr));

		/*
		 * 重点：List asList(数组)将数组转成集合
		 * 好处：可以使用集合的方法操作数组中的元素
		 * 注意：数组的长度时固定的，所以对于集合的增删是不可以的，否则会发生异常UnsupportedOperationException
		 * 
		 * */
		//List<String> list=Arrays.asList("s","f","id","nckd");
//		boolean b=list.contains("f");
//		System.out.println(b);
//		list.add("hiahia");
		//System.out.println(list);//UnsupportedOperationException

		//注意:
		/*如果数组中的元素是对象，那么转成集合时，直接将数组中的元素作为集合中的元素进行集合存储
		 * 如果数组中的元素是基本数据类型，那么会将该数组作为集合中的元素进行集合存储
		 * (也就是说将数组作为一个整体存入集合中，这样集合中就只有一个元素，打印出来的也会是引用变量中存储的地址值)
		  注意这里的泛型*/
		//List<int[]> list1=Arrays.asList(arr);
		//System.out.println(list1);
		
		
		/*重点：List.toArrays()  将集合转换成数组
		 * 	需要传入一个指定类型的数组
		 * 长度该如何定义呢？如果长度小于集合的size，那么该方法会创建一个同类型并和集合相同size的数组
		 * 			如果长度大于集合的size，那么该方法就会使用指定的数组，存储集合中的元素，其他位置默认为null;
		 * 所以建议长度为 集合的size
		 * 
		 * */
		List<String> list=new ArrayList<String>();
		list.add("nj");
		list.add("liu");
		list.add("iu");
		list.add("ss");
		list.add("dd");
		
		String[] arr=list.toArray(new String[list.size()]);
		System.out.println(Arrays.toString(arr));
	}
	//toString 的经典实现
	public static String myToString(int[] a){
		int iMax = a.length - 1;
		
		if (iMax == -1)   return "[]";
		
		StringBuilder b = new StringBuilder();
		
	    b.append('[');
	    
	    for (int i = 0; ; i++) {
	    	
	        b.append(a[i]);
	        
	        if (i == iMax)  return b.append(']').toString();
	        
	        b.append(", ");
	     }
	 }
}
