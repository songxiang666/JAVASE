package com.song.ThreadDemo2;
//Ҫ��  �� ��֤��Դ�İ�ȫ��

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
	private String name;
	private String gender;
	private Boolean flag=false;
	public synchronized void set(String name,String gender){
		if(flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.name=name;
		this.gender=gender;
		this.flag=true;
		this.notify();
	}
	public synchronized void out(){
		if(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(name+"..+.."+gender);
		flag=false;
		this.notify();
	}
}

//����
class Input implements Runnable{
	private Resource r;
	Input(Resource r){
		this.r=r;
	}
	public void run(){
		int x=0;
		while(true){
			if(x==0){
				r.set("Mike","nan");
			}else{
				r.set("����","ŮŮŮŮ");
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
			r.out();
		}
	}
}