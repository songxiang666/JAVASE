package com.song.stopThread;

public class StopThread {
	public static void main(String[] args){
		Stop s=new Stop();
		
		Thread d1=new Thread(s);
		Thread d2=new Thread(s);
		
		d1.start();
		d2.setDaemon(true);
		d2.start();
		
		int num=1;
		for(;;){
			if(++num==50){
				d1.interrupt();
				break;
			}
			System.out.println("main..."+num);
		}
		System.out.println("over");
	}
}
class Stop implements Runnable{
	private Boolean flag=true;
	public void setflag(Boolean flag){
		this.flag=flag;
	}
	public void run(){
		while(flag){
			synchronized(this){
				try{
					this.wait();
				}catch(InterruptedException e){
				}
			}
		}
	}
}