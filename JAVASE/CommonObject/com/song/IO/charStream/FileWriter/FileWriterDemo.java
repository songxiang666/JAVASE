package com.song.IO.charStream.FileWriter;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException{
		//创建一个可以往文件中写入字符数据的字符输出流对象
		//如果构造函数中加入true,可以实现对文件的续写
		FileWriter fw=new FileWriter("demo.txt",true);
		//调用writer对象中的writer方法 写入数据  存储在缓冲区
		fw.write("宋湘你永远是最棒的！xbs"+LINE_SEPARATOR+"hb");
		//进行刷新，将缓冲区数据直接写到目的地中
		fw.flush();
		fw.write("666");
		//关闭文件流   关闭资源  在关闭资源前会调用flush  刷新数据
		fw.close();
		System.out.println(LINE_SEPARATOR);
	}
}
