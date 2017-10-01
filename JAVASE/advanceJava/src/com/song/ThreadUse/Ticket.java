package com.song.ThreadUse;

public class Ticket implements Runnable{
	private int num=100;//有100张票
//	Object obj=new Object();  锁
	//static可以   但这里我们不用静态来共享数据  原因是 有局限性  (不能有多个线程来卖多个一百张的票  只能多个线程来卖一个一百张的票)
	public void run(){
		while(true){
			Object obj=new Object();//多个线程判断的不是同一个锁
			synchronized(obj){//锁  和钥匙
				if(num>0){
					try{
						Thread.sleep(10);
					}catch(InterruptedException e){}
					System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
				}
			}
		}
	}
}
/*
 * 阶段一：用Ticket extends Thread  把num=100设置为静态
public class Ticket extends Thread{
	private static int num=100;//有100张票
	//static可以   但这里我们不用静态来共享数据  原因是 有局限性  (不能有多个线程来卖多个一百张的票  只能多个线程来卖一个一百张的票)
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
			if(num==0){
				break;
			}
		}
	}
}*/
/*
 * 阶段二：用Ticket implements Runnable  把num=100设置不设为静态
public class Ticket implements Runnable{
	private int num=100;//有100张票
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
			if(num==0){
				break;
			}
		}
	}
}
main{
	创建一个票对象  多个线程   多个线程类操作一个对象 同时开启
	Ticket t=new Ticket();
		
	Thread t1=new Thread(t);
	Thread t2=new Thread(t);
	Thread t3=new Thread(t);
	Thread t4=new Thread(t);
		
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
*/
/*
 * 线程安全问题 ：
 * 	1.多个线程在操作共享的的数据
 * 	2.操作贡献数据的线程代码有多条
 * 当一个线程在执行操作共享数据的多条代码时，其他线程参与了运算就会导致线程安全问题的产生。
 * 
 * 解决思路：
 * 将多条操作共享数据的线程代码封装起来，当有线程在执行这些代码时
 * 其他线程时不可以参与运算的
 * 必须要当前线程把这些diamante都执行完毕之后，其他线程才可以参与运算
 * 
 * 在java中用同步代码块就可以解决这个问题
 * 同步的形式：
 * 1.同步代码块的格式：
 * 
 * synchronized(对象){
 * 	需要被同步的代码;
 * }
 * 
 * synchronized(obj){
		if(num>0){
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
		}
	}
	
	同步的好处：解决线程安全问题
		弊端：相对降低了效率  因为同步外 的线程都会判断同步锁
	
	同步的前提：同步中必须有多个线程并使用同一个锁！！！
 */