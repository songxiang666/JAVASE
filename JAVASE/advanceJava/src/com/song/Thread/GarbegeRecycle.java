package com.song.Thread;

public class GarbegeRecycle{
	public static void main(String[] args){
		new ThreadDemo1();
		new ThreadDemo1();
		
		System.gc();//作用启动垃圾回收器  但是具体什么时候进行垃圾回收不确定
		new ThreadDemo1();
		System.out.println("Hello World");
		
		/*Hello World
		  Recycle!
		  Recycle!
		 */
	}
}

class ThreadDemo1{
	public void finalize(){//重写Object的finalize() 垃圾回收方法
		System.out.println("Recycle!");
	}
}