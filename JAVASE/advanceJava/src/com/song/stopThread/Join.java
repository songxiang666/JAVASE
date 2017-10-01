package com.song.stopThread;

public class Join {
	public static void main(String[] args)throws Exception{
		Joi j=new Joi();
		Thread t1=new Thread(j);
		Thread t2=new Thread(j);
		
		t1.start();
		
		//t1.join();//加上t1.join()后  main线程会失去执行权 进入冻结状态  只有t1结束线程之后 才会复活 争夺执行权  
		
		t2.start();
		t1.join();
		for(int x=0;x<50;x++){
			System.out.println(Thread.currentThread().getName()+"....."+x);
		}
	}
}
class Joi implements Runnable{
	public void run(){
		for(int x=0;x<50;x++){
			System.out.println(Thread.currentThread().getName()+"....."+x);
		}
	}
}