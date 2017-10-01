package com.song.Producer1;

import java.util.concurrent.locks.*;

//Lock接口 与Condition接口 JDK1.5示例
public class LockCondition {

}
class BoundedBuffer{
	final Lock lock=new ReentrantLock();//一个锁
	final Condition notFull =lock.newCondition(); //一个非满监视器
	final Condition notEmpty=lock.newCondition();//一个非空监视器
	
	final Object[] items=new Object[100]; //装货物的箱子
	int putptr;//记录装入的下标 
	int takeptr;//记录取出的下标
	int count;//记录箱子里货物的数量
	
	
	//装货物的方法
	public void put(Object x)throws InterruptedException{
		lock.lock();//拿到锁  关锁
		try{
			while(count==items.length)//如果箱子满了  
				notFull.await(); //停止装箱 非满监视器 中的线程进入冻结状态
			if(++putptr==items.length) putptr=0;  //如果装入下标到了数组长度    恢复到下标为0  从头开始装
			items[putptr]=x; //装箱
			count++;  //每装一个货物 数量加1
			notEmpty.signal(); //唤醒非空监视器中  任意被冻结的一个线程
		}finally{lock.unlock();}//放锁  开门
	}
	//取货物的方法
	public Object out()throws InterruptedException{
		lock.lock();//拿到锁  关锁
		try{
			while(count==0){//如果箱子空了  
				notEmpty.await();//停止取货  非空监视器中的线程进入冻结状态
			}
			if(++takeptr==items.length) takeptr=0;//如果取货下标到了数组长度    恢复到下标为0  从头开始取
			Object x=items[takeptr];//取货
			count--;//每取一个货物 数量减1
			notFull.signal();//唤醒非满监视器中  任意被冻结的一个线程
			return x;//返回取到的货物
		}finally{
			lock.unlock();//开门
		}
	}
}