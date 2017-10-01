package com.song.ThreadDemo;
//线程通信
//  线程使用同步后还是出现问题   多个线程是否使用的是同一个锁？？？？
//多个线程在处理同一资源，但是任务不同
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
	String name;
	String gender;
}

//输入
class Input implements Runnable{
	Resource r;
	Input(Resource r){
		this.r=r;
	}
	public void run(){
		int x=0;
		while(true){
			synchronized(r){
				if(x==0){
					r.name="Mike";
					r.gender="male";
				}else{
					r.name="丽丽";
					r.gender="女女女女";
				}
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
			synchronized(r){
				System.out.println(r.name+"...."+r.gender);
			}
		}
	}
}