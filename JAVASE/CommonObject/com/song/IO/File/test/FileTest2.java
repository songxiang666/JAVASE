package com.song.IO.File.test;

import java.io.File;

//ɾ��һ�������ݵ�Ŀ¼
public class FileTest2 {
	public static void main(String[] args){
		File dir=new File("e:\\");
		remove(dir);
	}

	public static void remove(File dir) {
		File[] files=dir.listFiles();
		
		for(File file:files){
			if(file.isDirectory()){
				remove(file);
			}else{
				file.delete();
			}
		}
		dir.delete();
	}
}
