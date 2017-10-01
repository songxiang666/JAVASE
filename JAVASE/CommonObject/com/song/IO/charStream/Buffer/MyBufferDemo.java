package com.song.IO.charStream.Buffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("demo.txt");
		MyBuffer br=new MyBuffer(fr);
		String line=null;
		int ch=0;
		//测试一行读取
		while((line=br.myReadline())!=null){
			System.out.println(line);
		}
		//测试单个读取
//		while((ch=br.myread())!=-1){
//			System.out.print((char)ch);
//		}
		br.myClose();
	}
}
