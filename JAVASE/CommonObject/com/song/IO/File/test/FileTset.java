package com.song.IO.File.test;

import java.io.File;

//深度遍历文件夹
public class FileTset {
	public static void main(String[] args){
		File dir=new File("e:\\JAVAdatum\\Linux");
		listAll(dir,0);
	}

	public static void listAll(File dir,int temp) {
		System.out.println(insertSpace(temp)+dir.getName());
		temp++;
		File[] files=dir.listFiles();
		
		for(int i=0;i<files.length;i++){
			if(files[i].isDirectory()){
				listAll(files[i],temp);
			}else{
				System.out.println(insertSpace(temp)+files[i].getName());
			}
		}
	}

	public static String insertSpace(int temp) {
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<temp;i++){
			sb.append("|---");
		}
		return sb.toString();
	}
}
