package com.song.Thread;

public class GarbegeRecycle{
	public static void main(String[] args){
		new ThreadDemo1();
		new ThreadDemo1();
		
		System.gc();//������������������  ���Ǿ���ʲôʱ������������ղ�ȷ��
		new ThreadDemo1();
		System.out.println("Hello World");
		
		/*Hello World
		  Recycle!
		  Recycle!
		 */
	}
}

class ThreadDemo1{
	public void finalize(){//��дObject��finalize() �������շ���
		System.out.println("Recycle!");
	}
}