package com.song.Producer1;

import java.util.concurrent.locks.*;

//Lock�ӿ� ��Condition�ӿ� JDK1.5ʾ��
public class LockCondition {

}
class BoundedBuffer{
	final Lock lock=new ReentrantLock();//һ����
	final Condition notFull =lock.newCondition(); //һ������������
	final Condition notEmpty=lock.newCondition();//һ���ǿռ�����
	
	final Object[] items=new Object[100]; //װ���������
	int putptr;//��¼װ����±� 
	int takeptr;//��¼ȡ�����±�
	int count;//��¼��������������
	
	
	//װ����ķ���
	public void put(Object x)throws InterruptedException{
		lock.lock();//�õ���  ����
		try{
			while(count==items.length)//�����������  
				notFull.await(); //ֹͣװ�� ���������� �е��߳̽��붳��״̬
			if(++putptr==items.length) putptr=0;  //���װ���±굽�����鳤��    �ָ����±�Ϊ0  ��ͷ��ʼװ
			items[putptr]=x; //װ��
			count++;  //ÿװһ������ ������1
			notEmpty.signal(); //���ѷǿռ�������  ���ⱻ�����һ���߳�
		}finally{lock.unlock();}//����  ����
	}
	//ȡ����ķ���
	public Object out()throws InterruptedException{
		lock.lock();//�õ���  ����
		try{
			while(count==0){//������ӿ���  
				notEmpty.await();//ֹͣȡ��  �ǿռ������е��߳̽��붳��״̬
			}
			if(++takeptr==items.length) takeptr=0;//���ȡ���±굽�����鳤��    �ָ����±�Ϊ0  ��ͷ��ʼȡ
			Object x=items[takeptr];//ȡ��
			count--;//ÿȡһ������ ������1
			notFull.signal();//���ѷ�����������  ���ⱻ�����һ���߳�
			return x;//����ȡ���Ļ���
		}finally{
			lock.unlock();//����
		}
	}
}