package com.song.IO.Properties;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
//利用 properties类  修改硬盘文件中的键值对数据
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		test_fileWriterAndFileReader();
	}

	public static void test_fileWriterAndFileReader() throws IOException {
		FileReader fr=new FileReader("info.txt");
		FileWriter fw=new FileWriter("info.txt");//此时fileWriter创建的into.txt文本会覆盖之前的文本
	}

	public static void test() throws IOException {
		//首先进行健壮性判断
		File file=new File("info.txt");
		if(!file.exists())//判断文件是否 存在  不存在  则创建一个新的文件
			//file.createNewFile();
			System.out.println(file.length());
		FileReader fr=new FileReader(file);
//		
		Properties p=new Properties();
//		
		p.load(fr);
//		
		p.put("kimi", "6667");
//		
		p.list(System.out);

		FileWriter fw=new FileWriter(file);//注意 FileWriter 会直接创建一个新的info文件
		p.store(fw, "exchange");
		fr.close();
		fw.close();
	}
}
