package com.song.t;

public class ThreadCommunication {
	public static void main(String[] args){
		Resource r=new Resource();
		
		Input in=new Input(r);
		Output out=new Output(r);
		
		Thread r1=new Thread(in);
		Thread r2=new Thread(out);
		
		r1.start();
		r2.start();
	}
}

class Resource{
	String name;
	String gender;
	Boolean flag=false;
}
//输入
class Input implements Runnable{
	private Resource r=new Resource();
	Input(Resource r){
		this.r=r;
	}
	public void run(){
		int x=0;
		while(true){
			synchronized(r){
				if(r.flag){
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				if(x==0){
					r.name="Mike";
					r.gender="nan";
				}else{
					r.name="花花";
					r.gender="女女女女";
				}
				r.flag=true;
				r.notify();
			}
			x=(x+1)%2;
		}
	}
}
//输出
class Output implements Runnable{
	private Resource r=new Resource();
	Output(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			synchronized(r){
				if(!r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println(r.name+"..."+r.gender);
				r.flag=false;
				r.notify();
			}
		}
	}
}