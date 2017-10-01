package com.song.ThreadDemo1;
//要求  ：  在线程0进行一次设置以后  线程1进行一次读取
//解决方法：
/*	【等待唤醒机制】
 * 	涉及的方法：
 * 	1.wait(); 冻结  让线程处于冻结状态  释放执行权与执行资格  被wait的线程会被存储到线程池中
 * 	2.notify(); 唤醒线程池中的一个线程(任意)  
 * 	3.notifyAll(); 唤醒线程池中的所有线程
 * 
 * 	这些方法逗比学定义在同步中
 * 因为这些方法是用于操作线程状态的方法
 * 必须要明确到底操作的是哪个锁上的线程  r.notify();
 * 
 * 
 * 为什么操作线程的方法wait notify notifyAll定义在object类中
 * */
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
	Boolean flag=false;
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
				if(r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				if(x==0){
					r.name="Mike";
					r.gender="male";
				}else{
					r.name="丽丽";
					r.gender="女女女女";
				}
				r.flag=true;
				r.notify(); 
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
				if(!r.flag)
					try {
						r.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				System.out.println(r.name+"...."+r.gender);
				r.flag=false;
				r.notify();
			}
		}
	}
}