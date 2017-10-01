package com.song.t;

import java.util.concurrent.locks.*;

//��������������
//Condition
public class ProduceCustum {
	public static void main(String[] args){
		
		Rescourc r=new Rescourc();
		
		Producer p=new Producer(r);
		Custum c=new Custum(r);
		
		Thread t1=new Thread(p);
		Thread t2=new Thread(p);
		Thread t3=new Thread(c);
		Thread t4=new Thread(c);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}

class Rescourc{
	private String name;
	private int count=1;
	private Boolean flag=false;
	//����һ����
	Lock lock=new ReentrantLock();
	//��������������
	Condition d1=lock.newCondition();
	Condition d2=lock.newCondition();
	
	public void set(String name){
		lock.lock();
		try{
			while(flag){
				try {
					d1.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.name=name+count;
			count++;
			System.out.println(Thread.currentThread().getName()+"...������..."+this.name);
			
			flag=true;
			d2.signal();
		}finally{
			lock.unlock();
		}
	}
	
	public void get(){
		lock.lock();
		try{
			while(!flag){
				try {
					d2.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"...������...."+name);
		
			flag=false;
			d1.signal();
		}finally{
			lock.unlock();
		}
	}
}
class Producer implements Runnable{
	private Rescourc r=new Rescourc();
	Producer(Rescourc r){
		this.r=r;
	}
	public void run() {
		while(true){
			r.set("��Ѽ");
		}
	}
}
class Custum implements Runnable{
	private Rescourc r=new Rescourc();
	Custum(Rescourc r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.get();
		}
	}
}