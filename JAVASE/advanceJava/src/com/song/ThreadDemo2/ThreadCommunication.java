package com.song.ThreadDemo2;
//要求  ： 保证资源的安全性

public class ThreadCommunication {
	public static void main(String[] args){
		//创建资源
		Resource r=new Resource();
		//创建任务   操作同一资源
		Input in=new Input(r);
		Output out=new Output(r);
		//创建线程 执行路径 用不同任务   操作同一资源
		Thread r1=new Thread(in);
		Thread r2=new Thread(out);
		//开启线程
		r1.start();
		r2.start();
	}
}

class Resource{
	private String name;
	private String gender;
	private Boolean flag=false;
	public synchronized void set(String name,String gender){
		if(flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		this.name=name;
		this.gender=gender;
		this.flag=true;
		this.notify();
	}
	public synchronized void out(){
		if(!flag)
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(name+"..+.."+gender);
		flag=false;
		this.notify();
	}
}

//输入
class Input implements Runnable{
	private Resource r;
	Input(Resource r){
		this.r=r;
	}
	public void run(){
		int x=0;
		while(true){
			if(x==0){
				r.set("Mike","nan");
			}else{
				r.set("花花","女女女女");
			}
			x=(x+1)%2;  //实现 0 1 的切换
		}
	}
}
//输出
class Output implements Runnable{
	Resource r;
	Output(Resource r){
		this.r=r;
	}
	public void run(){
		while(true){
			r.out();
		}
	}
}