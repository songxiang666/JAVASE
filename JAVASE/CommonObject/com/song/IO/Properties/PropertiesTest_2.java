package com.song.IO.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

//需求：定义功能 获取一个应用程序运行的次数，如果超过5次，给出使用的次数已经到上限，停止运行程序
public class PropertiesTest_2 {
	public static void main(String[] args) throws IOException {
		getAppCount();
	}

	public static void getAppCount() throws IOException {
		//将配置文件封装成file对象
		File confile=new File("count.properties");
		
		if(!confile.exists())
			confile.createNewFile();
		
		FileInputStream fis=new FileInputStream(confile);
		
		Properties p=new Properties();
		p.load(fis);
		
		
		//从集合中获取键 值 次数
		String value=p.getProperty("time");
		//定义计数器
		int count=0;
		if(value!=null){
			count=Integer.parseInt(value);
			if(count>=2)
				throw new RuntimeException("使用次数已达上限，请购买正版软件！");
		}
		
		count++;
		
		p.setProperty("time",count+"");
		
		FileWriter fw=new FileWriter(confile);
		
		p.store(fw,"count");
		
		fis.close();
		fw.close();
	}

}
