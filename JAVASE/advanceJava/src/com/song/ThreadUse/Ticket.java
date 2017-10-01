package com.song.ThreadUse;

public class Ticket implements Runnable{
	private int num=100;//��100��Ʊ
//	Object obj=new Object();  ��
	//static����   ���������ǲ��þ�̬����������  ԭ���� �о�����  (�����ж���߳��������һ���ŵ�Ʊ  ֻ�ܶ���߳�����һ��һ���ŵ�Ʊ)
	public void run(){
		while(true){
			Object obj=new Object();//����߳��жϵĲ���ͬһ����
			synchronized(obj){//��  ��Կ��
				if(num>0){
					try{
						Thread.sleep(10);
					}catch(InterruptedException e){}
					System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
				}
			}
		}
	}
}
/*
 * �׶�һ����Ticket extends Thread  ��num=100����Ϊ��̬
public class Ticket extends Thread{
	private static int num=100;//��100��Ʊ
	//static����   ���������ǲ��þ�̬����������  ԭ���� �о�����  (�����ж���߳��������һ���ŵ�Ʊ  ֻ�ܶ���߳�����һ��һ���ŵ�Ʊ)
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
			if(num==0){
				break;
			}
		}
	}
}*/
/*
 * �׶ζ�����Ticket implements Runnable  ��num=100���ò���Ϊ��̬
public class Ticket implements Runnable{
	private int num=100;//��100��Ʊ
	public void run(){
		while(true){
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
			if(num==0){
				break;
			}
		}
	}
}
main{
	����һ��Ʊ����  ����߳�   ����߳������һ������ ͬʱ����
	Ticket t=new Ticket();
		
	Thread t1=new Thread(t);
	Thread t2=new Thread(t);
	Thread t3=new Thread(t);
	Thread t4=new Thread(t);
		
	t1.start();
	t2.start();
	t3.start();
	t4.start();
}
*/
/*
 * �̰߳�ȫ���� ��
 * 	1.����߳��ڲ�������ĵ�����
 * 	2.�����������ݵ��̴߳����ж���
 * ��һ���߳���ִ�в����������ݵĶ�������ʱ�������̲߳���������ͻᵼ���̰߳�ȫ����Ĳ�����
 * 
 * ���˼·��
 * �����������������ݵ��̴߳����װ�����������߳���ִ����Щ����ʱ
 * �����߳�ʱ�����Բ��������
 * ����Ҫ��ǰ�̰߳���Щdiamante��ִ�����֮�������̲߳ſ��Բ�������
 * 
 * ��java����ͬ�������Ϳ��Խ���������
 * ͬ������ʽ��
 * 1.ͬ�������ĸ�ʽ��
 * 
 * synchronized(����){
 * 	��Ҫ��ͬ���Ĵ���;
 * }
 * 
 * synchronized(obj){
		if(num>0){
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){}
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
		}
	}
	
	ͬ���ĺô�������̰߳�ȫ����
		�׶ˣ���Խ�����Ч��  ��Ϊͬ���� ���̶߳����ж�ͬ����
	
	ͬ����ǰ�᣺ͬ���б����ж���̲߳�ʹ��ͬһ����������
 */