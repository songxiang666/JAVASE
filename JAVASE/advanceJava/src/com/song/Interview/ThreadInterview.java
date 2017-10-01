package com.song.Interview;

public class ThreadInterview {
	public static void main(String[] args){
//		new Thread(new Runnable(){
//			public void run(){
//				System.out.println("Runnable run.....");
//			}
//		}){
//			public void run(){
//				System.out.println("Thread run.....");
//			}
//		}.start();
		Ramp r=new Ramp();
		Temp t=new Temp(r);
		t.start();
	}
}
class Temp extends Thread {
	Temp(Runnable r){
		super(r);
	}
	public void run(){
		System.out.println("Thread run.....");
	}
}
class Ramp implements Runnable{
	public void run(){
		System.out.println("Runnable run.....");
	}
}
