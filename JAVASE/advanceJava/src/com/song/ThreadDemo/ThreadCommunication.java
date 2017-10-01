package com.song.ThreadDemo;
//�߳�ͨ��
//  �߳�ʹ��ͬ�����ǳ�������   ����߳��Ƿ�ʹ�õ���ͬһ������������
//����߳��ڴ���ͬһ��Դ����������ͬ
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
				if(x==0){
					r.name="Mike";
					r.gender="male";
				}else{
					r.name="����";
					r.gender="ŮŮŮŮ";
				}
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
				System.out.println(r.name+"...."+r.gender);
			}
		}
	}
}