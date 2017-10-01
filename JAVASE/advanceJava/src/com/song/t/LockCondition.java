package com.song.t;
import java.util.concurrent.locks.*;

public class LockCondition {

}
class BoundBuffer{
	final Lock lock=new ReentrantLock();
	final Condition notFull=lock.newCondition();
	final Condition notEmpty=lock.newCondition();
	private int putptr,takeptr,count;
	final Object[] items=new Object[100];
	public void put(Object x) throws InterruptedException{
		lock.lock();
		try{
			while(count==items.length){
				notFull.await();
			}
			if(++putptr==items.length) putptr=0;
			items[putptr]=x;
			count++;
			notEmpty.signal();
		}finally{
			lock.unlock();
		}
	}
	public Object out()throws InterruptedException{
		lock.lock();
		try{
			while(count==0){
				notEmpty.await();
			if(++takeptr==items.length) takeptr=0;
			Object x=items[takeptr];
			count--;
			notFull.signal();
			return x;
			}
		}finally{
			lock.unlock();
		}
		return count;
	}
}