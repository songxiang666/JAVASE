package com.song.Producer1;

import java.util.concurrent.locks.*;

/*生产者  消费者
 * 
 * jdk1.5以后将同步和锁封装成了对象
 * 并将操作锁的隐式方式定义到了该对象中
 * 将隐式动作变成了显示动作
 * 
 * Lock接口：出现了代替同步代码块或同步函数 将同步的隐式锁操作变成显示锁操作
 * 		同时更为灵活，可以一个锁上加上多组监视器
 * 
 * lock():获取锁
 * unlock():释放锁，通常需要定义在finally代码块中
 * 
 * condition接口：替代的object中的wait notify notifyAll方法
 * 			将这些监视器方法单独进行了封装，变成Condition监视器对象
 * 			可以和任意的锁组合
 *await();   
 *signal();
 *signalAll();
 * */
public class ProducerCustumer {
	public static void main(String[] args){
		Resource r=new Resource();
		
		Producer pro=new Producer(r);
		Comsumer com=new Comsumer(r);
		
		Thread r0=new Thread(pro);
		Thread r1=new Thread(pro);
		Thread r2=new Thread(com);
		Thread r3=new Thread(com);
		
		r0.start();
		r1.start();
		r2.start();
		r3.start();
	}
}

class Resource{
	private String name;
	private int count=1;
	private Boolean flag=false;
	
	//创建一个锁对象
	Lock lock=new ReentrantLock();
	//通过已有的锁获取该锁上的监视器对象  一组监视生产者   一组监视消费者
	Condition con1=lock.newCondition();//生产者的监视器
	Condition con2=lock.newCondition();//消费者的监视器
	public  void set(String name){//t0  t1
		lock.lock();
		try{
			while(flag)
				try {
					con1.await();//t0 t1
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			this.name=name+count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...生产者.5.0.."+this.name);
				
			flag=true;
			con2.signal();
		}finally{
			lock.unlock();
		}
	}
	public void out(){// t2 t3
		lock.lock();
		try{
			while(!flag)
				try {
					con2.await();//t2  t3 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+".......消费者..5.0."+this.name);
				
			flag=false;
			con1.signal();
		}finally{
			lock.unlock();
		}
	}
}

//生产者

class Producer implements Runnable{
	private Resource r=new Resource();
	Producer(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			synchronized(this){
				r.set("烤鸭");
			}
		}
	}
}

//消费者
class Comsumer implements Runnable{
	private Resource r=new Resource();
	Comsumer(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			synchronized(this){
				r.out();
			}
		}
	}
}