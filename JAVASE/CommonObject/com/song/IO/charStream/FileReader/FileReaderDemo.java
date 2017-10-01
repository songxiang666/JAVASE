package com.song.IO.charStream.FileReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//要求：从一个特定的文件中读取数据
//方式一：一次读一个字符
public class FileReaderDemo {
	public static void main(String[] args) throws IOException{
		/*1.创建读取字符数据的流对象
		 * 
		 * 在创建读取流对象时  必须明确被读取类的文件 且该文件必须存在
		 * 目的是用用一个读取流关联一个存在文件
		 * 
		 * */
		FileReader fr=new FileReader("demo.txt");
		int ch=0;
		while((ch=fr.read())!=-1){
			System.out.println((char)ch);
		}
		fr.close();
	}
}
