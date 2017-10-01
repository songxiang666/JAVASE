package com.song.Thread;

public class ThreadDemo04{
	public static void main(String[] args){
		Runnable r=new Runnable(){
			private String name="кноФ";
			public void run(){
				show();
			}
			public void show(){
				for(int x=0;x<9;x++){
					System.out.println("name="+name+"..."+x);}
				}
			};
		new Thread(r).start();
		new Thread(r).start();
	}
}