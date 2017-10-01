package com.song.ThreadUse;
/*
 * 同步函数的锁 是 this!!!
 * 
 * 静态同步函数的锁是 该函数所属的字节码文件对象     可以用this.getClass()或者 当前类名.class   形式表示
 * 
 * */
public class StaticSynchronizedLockDemo{
	public static void main(String[] args){
		SynchronizedLock1 s=new SynchronizedLock1();
		
		//获取 该对象所属的字节码文件对象
		Class clazz=s.getClass();//利用对象
		Class clazz1=SynchronizedLock1.class;//利用类名
		
		System.out.println("s:"+s.getClass());//获取到 该对象所属的字节码文件对象
		//s:class com.song.ThreadUse.SynchronizedLock1
		
		
		Thread t1=new Thread(s);
		Thread t2=new Thread(s);
		
		t1.start();
		s.flag=false;
		t2.start();
	}
}
class SynchronizedLock1 implements Runnable{
	private static int num=100;
	public boolean flag=true;
//	private Object obj=new Object();
	public void run(){
		System.out.println(this.getClass());//输出 该函数所属的字节码文件对象
		//class com.song.ThreadUse.SynchronizedLock1
		
		
		if(flag){
			while(true){
				synchronized(this.getClass()){
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
	private static synchronized void saleTicket(){//静态同步函数
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
		}
	}
}