package com.song.IO.Sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SplitFile {
	private static final int SIZE = 1024*1024;

	public static void main(String[] args) throws IOException {
		File file=new File("e:\\christmas.mp3");
		splitFile(file);
	}
	public static void splitFile_2(File file) throws IOException {
		//用读取流关联源文件
		FileInputStream fis=new FileInputStream(file);
		
		//定义一个1M的缓冲区
		byte[] buf=new byte[SIZE];
		
		//创建目的
		FileOutputStream fos=null;
		
		int len=0;
		int quen=1;
		
		File dir=new File("e:\\partFiles");
		if(!dir.exists())
			dir.mkdir();
		
		while((len=fis.read(buf))!=-1){  //将文件存放在指定目录下
			fos=new FileOutputStream(new File(dir,(quen++)+".part"));
			fos.write(buf,0,len);
		}
		
		fos.close();
		fis.close();
		
	}
	public static void splitFile(File file) throws IOException{
		Properties p=new Properties();
		
		
		//用读取流关联源文件
		FileInputStream fis=new FileInputStream(file);
		
		//定义一个1M的缓冲区
		byte[] buf=new byte[SIZE];
		
		//创建目的
		FileOutputStream fos=null;
		
		int len=0;
		int quen=1;
		
		File dir=new File("e:\\partFiles");
		if(!dir.exists())
			dir.mkdir();
		
		while((len=fis.read(buf))!=-1){  //将文件存放在指定目录下
			fos=new FileOutputStream(new File(dir,(quen++)+".part"));
			fos.write(buf,0,len);
		}
		
		//将被切割的数据文件信息保存到prop集合中
		p.setProperty("partcount",quen+"");
		p.setProperty("filename",file.getName());
		
		fos=new FileOutputStream(new File(dir,quen+".properties"));
		
		//将prop集合中的数据存储到文件中
		p.store(fos, "save files info");
		
		fos.close();
		fis.close();
	}
	
}
