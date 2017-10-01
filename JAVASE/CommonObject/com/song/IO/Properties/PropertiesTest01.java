package com.song.IO.Properties;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * 需求：获取指定目录，指定扩展名的文件(包括子目录中) 将这些文件的指定扩展名的文件列表
 	思路：1.必须进行深度遍历
 		2.要在遍历过程中进行过滤 将符合条件的内容都存储到容器中
 		3.对容器中的内容进行遍历 并将绝对路径写入到文件中
 */
public class PropertiesTest01 {
	public static void main(String[] args) throws IOException {
		File file=new File("D:\\Myeclipse\\CommonObject");
		
		ArrayList<File> list=new ArrayList<File>();
		
		getFiles(file,new FilterNameByJava(),list);
		
		File listFile=new File(file,"list.txt");
		
		writeToFile(list,listFile);
	}
	public static void writeToFile(List<File> list,File listFile) throws IOException{
		BufferedWriter bufw=null;
		try{
			bufw=new BufferedWriter(new FileWriter(listFile));
			
			for(File file:list){
				bufw.write(file.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
		}finally{
			if(bufw!=null)
				try {
					bufw.close();
				} catch (IOException e) {
					
					throw new RuntimeException("关闭失败！");
				}
		}
	}
	/**
	 * 对指定目录中的内容进行深度遍历，并按照指定过滤器，进行过滤
	 * @param dir
	 * @param fil
	 * @param list
	 */
	public static void getFiles(File dir,FilenameFilter fil,List<File> list){
		File[] arr=dir.listFiles();
		for(File file:arr){
			if(file.isDirectory())
				//进行递归
				getFiles(file,fil,list);
			else{
				//对遍历到的文件进行过滤器的遍历  符合条件的存入list中
				if(fil.accept(dir, file.getName()))
					list.add(file);
			}
		}
	}
}
