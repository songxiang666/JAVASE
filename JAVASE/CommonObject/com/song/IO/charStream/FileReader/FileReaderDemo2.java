package com.song.IO.charStream.FileReader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		char[] buf=new char[3];
		int len=0;
		while((len=fr.read(buf))!=-1)
			System.out.print(new String(buf,0,len));
		/*
		int num=fr.read(buf);
		System.out.println(num+"::"+new String(buf));
		int num1=fr.read(buf);
		System.out.println(num1+"::"+new String(buf));
		int num2=fr.read(buf);
		System.out.println(num2+"::"+new String(buf));
		*/
		/* 运行结果：
		 * 3::abc 
		 * 1::dbc 
		 * -1::dbc
		 * */
		fr.close();
	}
}
