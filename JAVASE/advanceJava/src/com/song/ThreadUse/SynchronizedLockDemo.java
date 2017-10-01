package com.song.ThreadUse;
/*
 * 同步函数的锁 是 this!!!
 * 
 * 同步函数与同步代码块的区别:
 * 同步代码块的锁是任意对象
 * 同步函数的锁固定是this
 * 
 * */
public class SynchronizedLockDemo{
	public static void main(String[] args){
		SynchronizedLock s=new SynchronizedLock();
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		
		t1.start();
		s.flag=false;
		t2.start();
	}
}
class SynchronizedLock implements Runnable{
	private int num=100;
	public boolean flag=true;
//	private Object obj=new Object();
	public void run(){
		if(flag){
			while(true){
				synchronized(this){
					if(num>0){
						System.out.println(Thread.currentThread().getName()+"...obj.."+num--);
					}
				}
			}
		}else{
			while(true){
				saleTicket();
			}
		}
	}
	private synchronized void saleTicket(){//同步函数
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
		}
	}
}