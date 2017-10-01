package com.song.Producer;

//�׶�һ
import java.util.concurrent.locks.*;
/*������  ������
 * 
 * 
 * ��������  ��������
 * 
 * if�жϱ�� ֻ��һ�� ���ô��ڵȴ������̱߳����Ѻ� �����жϵڶ��ζ�������������  ���¶������  
 * 
 * while�жϱ�ǣ�������̻߳�ȡִ��Ȩ���Ƿ�Ҫ��������
 * 
 *--------------
 * notify ֻ�ܻ���һ���߳� ������������˱���û������  �Ӷ�������������
 * 
 * notifyAll����ˣ������߳�һ���ỽ�ѶԷ��̡߳�
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
			System.out.println(Thread.currentThread().getName()+"...������..."+this.name);
				
			flag=true;
			this.notifyAll();//��������
	}
	public synchronized void out(){// t2 t3
			while(!flag)
				try {
					this.wait();//t2  t3 
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			System.out.println(Thread.currentThread().getName()+".......������..."+this.name);
				
			flag=false;
			this.notifyAll();
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
			r.set("��Ѽ");
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
			r.out();
		}
	}
}