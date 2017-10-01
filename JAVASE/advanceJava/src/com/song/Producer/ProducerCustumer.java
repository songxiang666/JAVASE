package com.song.Producer;

//阶段一
import java.util.concurrent.locks.*;
/*生产者  消费者
 * 
 * 
 * 多生产者  多消费者
 * 
 * if判断标记 只有一次 会让处于等待区的线程被唤醒后 不会判断第二次而接着往下运行  导致多次生产  
 * 
 * while判断标记，解决了线程获取执行权后，是否要接着运行
 * 
 *--------------
 * notify 只能唤醒一个线程 如果本方唤醒了本方没有意义  从而导致死锁现象
 * 
 * notifyAll解决了，本方线程一定会唤醒对方线程。
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
	public synchronized void set(String name){//t0  t1
			while(flag)
				try {
					this.wait();//t0 t1
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			this.name=name+count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...生产者..."+this.name);
				
			flag=true;
			this.notifyAll();//唤醒所有
	}
	public synchronized void out(){// t2 t3
			while(!flag)
				try {
					this.wait();//t2  t3 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+".......消费者..."+this.name);
				
			flag=false;
			this.notifyAll();
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
			r.set("烤鸭");
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
			r.out();
		}
	}
}