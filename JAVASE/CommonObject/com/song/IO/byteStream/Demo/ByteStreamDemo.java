package com.song.IO.byteStream.Demo;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamDemo {
	public static void main(String[] args) throws IOException {
		demo_Read();
	}

	public static void demo_Read() throws IOException {
		//1.创建一个输入流对象
		FileInputStream fi=new FileInputStream("byte.txt");
		//System.out.println(fi.available());//需要谨慎使用关联方法  容易内存溢出
		//读取数据的三种方式
		//1.
		byte[] buf=new byte[fi.available()];
		fi.read(buf);
		System.out.println(new String(buf));
		//2.建议使用这种方法
//		byte[] buf=new byte[1024];
//		int len=0;
//		while((len=fi.read(buf))!=-1)
//			System.out.println(new String(buf,0,len));
		//3.
//		int ch=0;
//		while((ch=fi.read())!=-1){
//			System.out.print((char)ch);
//		}
//		fi.close();
	}

	public static void demo_write() throws IOException {
		//1.创建一个输出流对象，用于操作文件
		FileOutputStream fp=new FileOutputStream("byte.txt");
		
		///2.写数据，直接写到目的地
		fp.write("cdhjjcodl".getBytes());
		
		//fp.flush()
		fp.close();
	}
}
