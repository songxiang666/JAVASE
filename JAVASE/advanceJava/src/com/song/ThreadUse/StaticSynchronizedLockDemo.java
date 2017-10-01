package com.song.ThreadUse;
/*
 * ͬ���������� �� this!!!
 * 
 * ��̬ͬ������������ �ú����������ֽ����ļ�����     ������this.getClass()���� ��ǰ����.class   ��ʽ��ʾ
 * 
 * */
public class StaticSynchronizedLockDemo{
	public static void main(String[] args){
		SynchronizedLock1 s=new SynchronizedLock1();
		
		//��ȡ �ö����������ֽ����ļ�����
		Class clazz=s.getClass();//���ö���
		Class clazz1=SynchronizedLock1.class;//��������
		
		System.out.println("s:"+s.getClass());//��ȡ�� �ö����������ֽ����ļ�����
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
		System.out.println(this.getClass());//��� �ú����������ֽ����ļ�����
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
	private static synchronized void saleTicket(){//��̬ͬ������
		if(num>0){
			System.out.println(Thread.currentThread().getName()+"...sale.."+num--);
		}
	}
}