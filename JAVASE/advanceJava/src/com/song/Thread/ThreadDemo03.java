package com.song.Thread;
/*�����̵߳ĵڶ��ַ���
 * 1.������ʵ��Runnable�ӿ�
 * 2.���ǽӿ��е�run���������̵߳���������װ��run������
 * 3.ͨ��Thread�ഴ���̶߳��󣬲���Runnable�ӿڵ����������ΪThread���캯���Ĳ������д���
 * 			Ϊʲô��  ��Ϊ�̵߳����񶼷�װ��Runnable �ӿڵ���������run�������ˡ�
 * 4.�����̶߳����start ���������߳�
 * 
 * 
 * ʵ��Runnable�ӿڵĺô���
 * 1.���̵߳�������̵߳������з�������������˵����ķ�װ 
 * 	 ������������˼�뽫�����װ�ɶ���
 * 2.������java���̳еľ����� 
 * 
 * ���Դ����̵߳ĵڶ��ַ�ʽ��Ϊ����
 * */
public class ThreadDemo03{
	public static void main(String[] args){
//		Demo03 d1=new Demo03("����");
//		Demo03 d2=new Demo03("xiaqiang");
//		d1.start();//�����߳� ����run����
//		d2.start();
		
		Demo03 d=new Demo03("����");
		Demo03 d1=new Demo03("����");
		
		Thread t=new Thread(d);
		Thread t1=new Thread(d1);
		t.start();
		t1.start();
	}
}
class Demo03 implements Runnable{
	private String name;
	Demo03(String name){
		this.name=name;
	}
	public void run(){
		show();
	}
	public void show(){
		for(int i=0;i<9;i++){
			System.out.println(this.name+"...x="+i);
		}
	}
}