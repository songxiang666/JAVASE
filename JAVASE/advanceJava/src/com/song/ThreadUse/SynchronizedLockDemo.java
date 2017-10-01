package com.song.ThreadUse;
/*
 * ͬ���������� �� this!!!
 * 
 * ͬ��������ͬ������������:
 * ͬ�������������������
 * ͬ�����������̶���this
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
	private synchronized void saleTicket(){//ͬ������
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
		}
	}
}