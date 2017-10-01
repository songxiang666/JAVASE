package com.song.ThreadUse;

public class DeadLockDemo {
	public static void main(String[] args){
		DeadLock01 d1=new DeadLock01(true);
		DeadLock01 d2=new DeadLock01(false);
		
		Thread t1=new Thread(d1);
		Thread t2=new Thread(d2);
		//两个线程操作两个对象  但是使用的是两个唯一的锁  而当两个锁出现嵌套使用的时候  会出现  死锁的情况
		t1.start();
		t2.start();
		
		/*打印结果
		 * Thread-0...if..obj1
		 * Thread-1...if..obj2
		 * */
	}
}

class DeadLock01 implements Runnable{
	private Boolean flag;
	DeadLock01(Boolean flag){
		this.flag=flag;
	}
	
	public void run(){
		if(flag){
			synchronized(MyLock.obj1){//锁1
				System.out.println(Thread.currentThread().getName()+"...if..obj1");
				synchronized(MyLock.obj2){//锁2
					System.out.println(Thread.currentThread().getName()+"...if..obj2");
				}
			}
		}else{
			synchronized(MyLock.obj2){//锁2
				System.out.println(Thread.currentThread().getName()+"...if..obj2");
				synchronized(MyLock.obj1){//锁1
					System.out.println(Thread.currentThread().getName()+"...if..obj1");
				}
			}
		}
	}
}
class MyLock{
	public static final Object obj1=new Object();//锁1
	public static final Object obj2=new Object();//锁2
}

