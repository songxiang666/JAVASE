package com.song.ThreadUse;
/*
 * 需求：两个储户  到银行存钱  一次100 共存三次
 */
/*2.同步函数：用synchronized 作为修饰符修饰函数
 * 	
 * */
public class Bank {
	private int sum;
//	private Object obj=new Object();
	public synchronized void add(int num){//同步函数
		//synchronized(obj){//锁
			sum+=num;
			//让线程睡一会儿  更加能看出问题
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){}
			System.out.println("sum="+sum);
		//}
	}
}
class Cus implements Runnable{
	private Bank b=new Bank();
	public void run(){
		for(int x=0;x<3;x++){
			b.add(100);
		}
	}
}
/*考虑有没有线程安全隐患
 * 1.有没有共享数据
 * 2.操作共享数据代码有多条
 * */