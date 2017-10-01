package com.song.ThreadUse;
//多线程下的单例模式

//饿汉式
public class Single {
	private static final Single s=new Single();
	private Single(){};
	
	public static Single getInstance(){
		return s;
	}
}


//懒汉式
//懒汉式具有线程安全问题
class  Single1{
	private static Single1 f=null;
	private Single1(){}
	public static Single1 getInstance(){
	
		//非常重要  ！！！
		if(f==null){//提高性能 效率
			synchronized(Single1.class){
				if(f==null)
					//-->0  -->1
					f=new Single1();
			}
		}
		return f;
		
	}
}