package com.song.IO.Sequence;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

public class MergeFile {
	public static void main(String[] args) throws IOException {
		File file=new File("E:\\partFiles");
		mergeFile_3(file);
	}
	public static void mergeFile_3(File dir) throws IOException{
		if(dir.exists()){
					
			Properties p=new Properties();
			
			//获取配置文件
			File[] files=dir.listFiles(new SuffixFilter(".properties"));
			
			//判断配置文件是否存在且唯一
			if(files.length!=1){
				throw new RuntimeException(dir+",该目录下没有properties文件或者不唯一！");
			}
			
			//加载配置文件  到Properties实例对象中
			p.load(new FileInputStream(files[0]));
			
			//获取文件的类型名
			String suffix=p.getProperty("filename").split("\\.")[1];
			
			//获取文件源的碎片个数
			int count=Integer.parseInt(p.getProperty("partcount"))-1;
			
			//获取所有的part碎片
			File[] partFiles=dir.listFiles(new SuffixFilter(".part"));
			
			//健壮性判断   判断碎片文件个数 是否与配置文件记录的数据一致   不一致 抛出异常
			if(partFiles.length!=count){
				throw new RuntimeException("碎片文件不符合要求，个数不对!应有"+count+"个");
			}
			
			//创建容器  
			ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
			for(int x=1;x<=partFiles.length;x++){
				//将关联了碎片文件的输入流存放到集合中
				list.add(new FileInputStream(partFiles[x]));
			}
			//通过集合  获取到所有关联碎片文件流对象的  枚举
			Enumeration<FileInputStream> e=Collections.enumeration(list);
			
			//创建序列对象
			SequenceInputStream sis=new SequenceInputStream(e);
			
			//创建输出流对象
			FileOutputStream fos=new FileOutputStream(new File(dir,"co."+suffix));
			
			//创建自定义缓冲区
			byte[] buf=new byte[1024*1024];
			
			int len=0;
			
			while((len=sis.read(buf))!=-1){
				fos.write(buf,0,len);//将从序列对象读取到的数据  写入输出流缓冲区
				fos.flush();//刷新缓冲区
			}
			sis.close();
			fos.close();
		}
		
	}
	public static void mergeFile_2(File dir) throws IOException {
		if(dir.exists()){
			
			Properties p=new Properties();
			
			File[] files=dir.listFiles();
			
			FilenameFilter ff=new FilenameFilter(){

				@Override
				public boolean accept(File dir, String name) {
					
					return name.endsWith(".properties");
				}
				
			};
			
			for(File file:files){
				if(ff.accept(dir,file.getName())){
					p.load(new FileInputStream(file));
					break;
				}
			}
			
			String fileName=p.getProperty("filename");
			
			String suffix=fileName.split("\\.")[1];
			
			int count=Integer.parseInt(p.getProperty("partcount"))-1;
			
			ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
			for(int x=1;x<=count;x++){
				list.add(new FileInputStream(new File(dir,x+".part")));
			}
			Enumeration<FileInputStream> e=Collections.enumeration(list);
			
			SequenceInputStream sis=new SequenceInputStream(e);
			
			
			
			FileOutputStream fos=new FileOutputStream(new File(dir,fileName));
			
			byte[] buf=new byte[1024*1024];
			
			int len=0;
			
			while((len=sis.read(buf))!=-1){
				fos.write(buf,0,len);
				fos.flush();
			}
			sis.close();
			fos.close();
		}
		
	}
	public static void mergeFile(File dir) throws IOException {
		if(dir.exists()){
			ArrayList<FileInputStream> list=new ArrayList<FileInputStream>();
			for(int x=1;x<=4;x++){
				list.add(new FileInputStream(new File(dir,x+".part")));
			}
			Enumeration<FileInputStream> e=Collections.enumeration(list);
			
			SequenceInputStream sis=new SequenceInputStream(e);
			
			FileOutputStream fos=new FileOutputStream(new File(dir,"co.mp3"));
			
			byte[] buf=new byte[1024*1024];
			
			int len=0;
			
			while((len=sis.read(buf))!=-1){
				fos.write(buf,0,len);
				fos.flush();
			}
			sis.close();
			fos.close();
		}
	}
}
