package com.song.Thread;
/*如何创建一个线程？
 * 方式一：继承thread类
 * 
 * 步骤：
 * 1.定义一个类继承Thread类
 * 2.覆盖thread类中的run方法
 * 3.直接创建Thread类的子类对象
 * 4.调用start方法  开启线程并调用线程的任务run方法执行
 * */
//调用run和调用start 有什么区别

//可以调用Thread类的getName方法  获取到线程的名字 用于区分线程
//Thread的静态方法   currentThread() 获取到当前运行的线程
//主线程的名字  main
public class ThreadDemo{
	public static void main(String[] args){
		Demo d1=new Demo("旺财","d1");
		Demo d2=new Demo("xiaqiang","d2");
		d1.start();//开启线程 调用run方法
		d2.start();
		System.out.println("over..name="+Thread.currentThread().getName());
	}
//	public static String CUrrent(){
//		return currentThread().getName();
//	}
}
class Demo extends Thread{
	private String name;
	Demo(String name,String Tname){
		super(Tname);
		this.name=name;
	}
	public void run(){
		for(int i=0;i<9;i++){
			System.out.println(this.name+"...x="+i+"...name="+currentThread().getName());
		}
	}
}