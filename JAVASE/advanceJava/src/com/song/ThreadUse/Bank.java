package com.song.ThreadUse;
/*
 * ������������  �����д�Ǯ  һ��100 ��������
 */
/*2.ͬ����������synchronized ��Ϊ���η����κ���
 * 	
 * */
public class Bank {
	private int sum;
//	private Object obj=new Object();
	public synchronized void add(int num){//ͬ������
		//synchronized(obj){//��
			sum+=num;
			//���߳�˯һ���  �����ܿ�������
			try{
				Thread.sleep(10);
			}catch(InterruptedException e){}
			System.out.println("sum="+sum);
		//}
	}
}
class Cus implements Runnable{
	private Bank b=new Bank();
	public void run(){
		for(int x=0;x<3;x++){
			b.add(100);
		}
	}
}
/*������û���̰߳�ȫ����
 * 1.��û�й�������
 * 2.�����������ݴ����ж���
 * */