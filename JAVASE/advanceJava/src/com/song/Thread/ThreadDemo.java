package com.song.Thread;
/*��δ���һ���̣߳�
 * ��ʽһ���̳�thread��
 * 
 * ���裺
 * 1.����һ����̳�Thread��
 * 2.����thread���е�run����
 * 3.ֱ�Ӵ���Thread����������
 * 4.����start����  �����̲߳������̵߳�����run����ִ��
 * */
//����run�͵���start ��ʲô����

//���Ե���Thread���getName����  ��ȡ���̵߳����� ���������߳�
//Thread�ľ�̬����   currentThread() ��ȡ����ǰ���е��߳�
//���̵߳�����  main
public class ThreadDemo{
	public static void main(String[] args){
		Demo d1=new Demo("����","d1");
		Demo d2=new Demo("xiaqiang","d2");
		d1.start();//�����߳� ����run����
		d2.start();
		System.out.println("over..name="+Thread.currentThread().getName());
	}
//	public static String CUrrent(){
//		return currentThread().getName();
//	}
}
class Demo extends Thread{
	private String name;
	Demo(String name,String Tname){
		super(Tname);
		this.name=name;
	}
	public void run(){
		for(int i=0;i<9;i++){
			System.out.println(this.name+"...x="+i+"...name="+currentThread().getName());
		}
	}
}