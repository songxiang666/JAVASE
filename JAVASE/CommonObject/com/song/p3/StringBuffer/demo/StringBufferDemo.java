package com.song.p3.StringBuffer.demo;

public class StringBufferDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * StringBuffer:就是字符串缓冲区
		 * 	用于存储数据的容器
		 * 特点：
		 * 1.长度时可变的
		 * 2.可以存储不同类型的数据
		 * 3.最终要转成字符串来使用
		 * 4.可以对字符串进行修改
		 * 
		 * 一个容器对象，应该具备的功能
		 * 1.添加
		 * 		StringBuffer append(data) 向容器对象添加数据 也会返回当前容器对象this
		 * 		StringBuffer insert(fontData,Data)
		 * 2.删除
		 * 		StringBuffer delete(int startIndex,int endIndex) //删除一段字符串 包含头不包含尾
		 * 		StringBuffer deleteCharAt(int index)删除指定位置的元素
		 * 
		 * 3.查找
		 * 		char charAt(index);
		 * 		int IndexOf(String);
		 * 		int LastIndexOf(String);
		 * 4.修改
		 * 		StringBuffer replace(start,end,string)
		 * 		void setCharAt(index,char)
		 * 很牛逼的函数 
		 * 		StringBuffer setLength(length);
		 * */
		//bufferMethodDemo();  //append与insert演示
		//bufferMethodDemo_1(); //delete的演示
		bufferMethodDemo_2(); //setLength的演示
	}

	private static void bufferMethodDemo_2() {
		StringBuffer sb=new StringBuffer("abcd");
		sb.setLength(2);
		System.out.println("sb="+sb);//直接设置长度
		
	}

	public static void bufferMethodDemo_1() {
		StringBuffer sb=new StringBuffer("abcd");
//		sb.delete(0,2);
//		System.out.println(sb);
		
		//清空缓冲区
		sb.delete(0, sb.length());
		System.out.println(sb);
	}

	public static void bufferMethodDemo() {
		//创建缓冲区对象
		StringBuffer sb=new StringBuffer();
		
	//	StringBuffer s1=sb.append(4);
		
//		System.out.println(sb);
//		System.out.println(s1);
//		System.out.println(sb==s1);
		sb.append(4).append(false).append(666);
		sb.insert(3,"haha");
		System.out.println(sb);
	}

}
