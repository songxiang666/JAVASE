package com.song.stopThread;

public class Join {
	public static void main(String[] args)throws Exception{
		Joi j=new Joi();
		Thread t1=new Thread(j);
		Thread t2=new Thread(j);
		
		t1.start();
		
		//t1.join();//����t1.join()��  main�̻߳�ʧȥִ��Ȩ ���붳��״̬  ֻ��t1�����߳�֮�� �ŻḴ�� ����ִ��Ȩ  
		
		t2.start();
		t1.join();
		for(int x=0;x<50;x++){
			System.out.println(Thread.currentThread().getName()+"....."+x);
		}
	}
}
class Joi implements Runnable{
	public void run(){
		for(int x=0;x<50;x++){
			System.out.println(Thread.currentThread().getName()+"....."+x);
		}
	}
}