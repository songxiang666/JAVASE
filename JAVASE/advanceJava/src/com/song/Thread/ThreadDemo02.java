package com.song.Thread;

public class ThreadDemo02{
	public static void main(String[] args){
		Demo01 d1=new Demo01("旺财","d1");
		Demo01 d2=new Demo01("xiaqiang","d2");
		d1.start();//开启线程 调用run方法
		d2.start();
		
		System.out.println(4/0);//好像会出事儿 throw ArithmeticException
		for(int x=0;x<9;x++){
			System.out.println("over..name="+Thread.currentThread().getName());
		}
	}
}
class Demo01 extends Thread{
	private String name;
	Demo01(String name,String Tname){
		super(Tname);
		this.name=name;
	}
	public void run(){
		int[] arr=new int[3];
		System.out.println(arr[3]);//Throw ArrayIndexOutOfBoundsException
		for(int i=0;i<9;i++){
			System.out.println(this.name+"...x="+i+"...name="+currentThread().getName());
		}
	}
}