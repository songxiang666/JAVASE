package com.song.ThreadDemo1;
//Ҫ��  ��  ���߳�0����һ�������Ժ�  �߳�1����һ�ζ�ȡ
//���������
/*	���ȴ����ѻ��ơ�
 * 	�漰�ķ�����
 * 	1.wait(); ����  ���̴߳��ڶ���״̬  �ͷ�ִ��Ȩ��ִ���ʸ�  ��wait���̻߳ᱻ�洢���̳߳���
 * 	2.notify(); �����̳߳��е�һ���߳�(����)  
 * 	3.notifyAll(); �����̳߳��е������߳�
 * 
 * 	��Щ��������ѧ������ͬ����
 * ��Ϊ��Щ���������ڲ����߳�״̬�ķ���
 * ����Ҫ��ȷ���ײ��������ĸ����ϵ��߳�  r.notify();
 * 
 * 
 * Ϊʲô�����̵߳ķ���wait notify notifyAll������object����
 * */
public class ThreadCommunication {
	public static void main(String[] args){
		//������Դ
		Resource r=new Resource();
		//��������   ����ͬһ��Դ
		Input in=new Input(r);
		Output out=new Output(r);
		//�����߳� ִ��·�� �ò�ͬ����   ����ͬһ��Դ
		Thread r1=new Thread(in);
		Thread r2=new Thread(out);
		//�����߳�
		r1.start();
		r2.start();
	}
}

class Resource{
	String name;
	String gender;
	Boolean flag=false;
}

//����
class Input implements Runnable{
	Resource r;
	Input(Resource r){
		this.r=r;
	}
	public void run(){
		int x=0;
		while(true){
			synchronized(r){
				if(r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				if(x==0){
					r.name="Mike";
					r.gender="male";
				}else{
					r.name="����";
					r.gender="ŮŮŮŮ";
				}
				r.flag=true;
				r.notify(); 
			}
			x=(x+1)%2;  //ʵ�� 0 1 ���л�
		}
	}
}
//���
class Output implements Runnable{
	Resource r;
	Output(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			synchronized(r){
				if(!r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println(r.name+"...."+r.gender);
				r.flag=false;
				r.notify();
			}
		}
	}
}