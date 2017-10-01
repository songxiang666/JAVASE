package com.song.Producer1;

import java.util.concurrent.locks.*;

/*������  ������
 * 
 * jdk1.5�Ժ�ͬ��������װ���˶���
 * ��������������ʽ��ʽ���嵽�˸ö�����
 * ����ʽ�����������ʾ����
 * 
 * Lock�ӿڣ������˴���ͬ��������ͬ������ ��ͬ������ʽ�����������ʾ������
 * 		ͬʱ��Ϊ������һ�����ϼ��϶��������
 * 
 * lock():��ȡ��
 * unlock():�ͷ�����ͨ����Ҫ������finally�������
 * 
 * condition�ӿڣ������object�е�wait notify notifyAll����
 * 			����Щ�������������������˷�װ�����Condition����������
 * 			���Ժ�����������
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
	
	//����һ��������
	Lock lock=new ReentrantLock();
	//ͨ�����е�����ȡ�����ϵļ���������  һ�����������   һ�����������
	Condition con1=lock.newCondition();//�����ߵļ�����
	Condition con2=lock.newCondition();//�����ߵļ�����
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
			System.out.println(Thread.currentThread().getName()+"...������.5.0.."+this.name);
				
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
			System.out.println(Thread.currentThread().getName()+".......������..5.0."+this.name);
				
			flag=false;
			con1.signal();
		}finally{
			lock.unlock();
		}
	}
}

//������

class Producer implements Runnable{
	private Resource r=new Resource();
	Producer(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			synchronized(this){
				r.set("��Ѽ");
			}
		}
	}
}

//������
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