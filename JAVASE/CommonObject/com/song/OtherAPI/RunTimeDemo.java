package com.song.OtherAPI;

import java.io.IOException;

public class RunTimeDemo {
	public static void main(String[] args){
		/*
		 * Runtime:没有构造方法，则该类不可以创建对象
		 * 有一个获取唯一对象的静态方法   getRuntime()
		 * 使用了单例模式 
		 * */
		Runtime rt=Runtime.getRuntime();
		//execute:执行  xxx.exe
		try {
			rt.exec("notepad.exe");
//			rt.exec("QQ.exe");将会执行失败 原因：QQ.exe没有在classpath路径下
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
