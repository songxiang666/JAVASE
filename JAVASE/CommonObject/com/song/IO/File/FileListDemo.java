package com.song.IO.File;

import java.io.File;

public class FileListDemo {
	public static void main(String[] args) {
		listDemo_4();
	}
	/**
	 * 按照指定的后缀  获得筛选的元素
	 * */
	public static void listDemo_4() {
		File dir=new File("e:\\");
		String[] files=dir.list(new FilterByAll(".jpg"));
		for(String file:files)
			System.out.println(file);
		
	}
	/**
	 * 获得所有e盘下没有隐藏的文件
	 * */
	public static void listDemo_3() {
		File dir=new File("e:\\");
		File[] files=dir.listFiles(new FilterByHidden());
		for(File file:files)
			System.out.println(file.getName());
		
	}
	/**
	 * 筛选出e盘下后缀为.jpg文件
	 * */
	public static void listDemo_2() {
		File dir=new File("e:\\");
		String[] names=dir.list(new FilterNameByJava());
		for(String name:names){
			System.out.println("--");
			System.out.println(name);
		}
	}
	/**
	 * 获得当前目录下所有的文件
	 * */
	public static void listDemo() {
		File file=new File("e:\\a.jpg");
		
		//获取当前目录下的文件以及文件夹的名称，包含隐藏文件
		//如果不是目录  则names为空     继续遍历操作会发生空指针异常 如果访问的系统目录也会发生空指针异常
		String[] names=file.list();
		System.out.println(names);
		//for(String name:names)
		//	System.out.println(name);
	}
}
