package com.song.Thread;
/*创建线程的第二种方法
 * 1.定义类实现Runnable接口
 * 2.覆盖接口中的run方法，将线程的任务代码封装到run方法中
 * 3.通过Thread类创建线程对象，并将Runnable接口的子类对象作为Thread构造函数的参数进行传递
 * 			为什么？  因为线程的任务都封装到Runnable 接口的子类对象的run方法中了。
 * 4.调用线程对象的start 方法开启线程
 * 
 * 
 * 实现Runnable接口的好处：
 * 1.将线程的任务从线程的子类中分离出来，进行了单独的封装 
 * 	 按照面向对象的思想将任务封装成对象
 * 2.避免了java单继承的局限性 
 * 
 * 所以创建线程的第二种方式较为常用
 * */
public class ThreadDemo03{
	public static void main(String[] args){
//		Demo03 d1=new Demo03("旺财");
//		Demo03 d2=new Demo03("xiaqiang");
//		d1.start();//开启线程 调用run方法
//		d2.start();
		
		Demo03 d=new Demo03("王五");
		Demo03 d1=new Demo03("宋六");
		
		Thread t=new Thread(d);
		Thread t1=new Thread(d1);
		t.start();
		t1.start();
	}
}
class Demo03 implements Runnable{
	private String name;
	Demo03(String name){
		this.name=name;
	}
	public void run(){
		show();
	}
	public void show(){
		for(int i=0;i<9;i++){
			System.out.println(this.name+"...x="+i);
		}
	}
}