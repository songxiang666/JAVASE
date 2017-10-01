package com.song.IO.Properties;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		demo_2();
	}
	/**
	 * 自己实现load方法！！！
	 * */
	public static void My_load() throws IOException {
		Properties p=new Properties();
		BufferedReader br=new BufferedReader(new FileReader("info.txt"));
		String line=null;
		while((line=br.readLine())!=null){
			if(!line.startsWith("#")){
				String[] arr=line.split("[=:]");//正则表达式
				p.put(arr[0], arr[1]);
			}
		}
		p.list(System.out);
		br.close();
	}

	public static void demo_3() throws IOException {
		Properties p=new Properties();
		//集合中的数据来自于一个文件。
		//注意：必须要保证该文件中的数据时键值对
		//需要使用到读取流：
		FileInputStream  fis=new FileInputStream("info.txt");
		//使用load方法  加载文件流中的数据
		p.load(fis);
		//
		p.list(System.out);//打印出集合中的键值对
	}

	public static void demo_2() throws IOException {
		Properties pt=new Properties();
		pt.put("kimi","666");
		pt.put("kimi2","6661");
		pt.put("kimi3","6662");
		pt.put("kimi4","6663");
		//想要将这些集合中的字符串键值信息持久化存储到文件中  而且需要关联输出流
		FileOutputStream fos=new FileOutputStream("info.txt");
		pt.store(fos, "name+age");//将pt中的键值信息存储到info.txt中
	}

	public static void demo_1() {
		Properties pt=new Properties();
		pt.put("kimi","666");
		pt.put("kimi2","6661");
		pt.put("kimi3","6662");
		pt.put("kimi4","6663");
		
		pt.list(System.out);//用于调试的功能  打印出键和值
	}
}
