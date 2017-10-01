package com.song.IO.transStream;

import java.io.IOException;
import java.io.InputStream;

public class ReadKey {
	public static void main(String[] args) throws IOException {
		readKey_2();
	}

	public static void readKey_2() throws IOException {
		InputStream in=System.in;
		StringBuffer sb=new StringBuffer();
		int ch=0;
		
		while((ch=in.read())!=-1){
			if(ch=='\r')
				continue;
			if(ch=='\n'){
				String temp=sb.toString();
				if("over".equals(temp))
					break;//自定义结束标记
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}
			else{sb.append((char)ch);}
		}
	}

	public static void readKey() throws IOException {
		InputStream in=System.in;
		
		int ch=in.read();
		System.out.println(ch);
		int ch1=in.read();
		System.out.println(ch1);
		int ch2=in.read();
		System.out.println(ch2);
		//写入一个字符回车后  输出：
		/*
		 * 97
		   13
		   10
		 * */
		//注意  system.in  无需关闭  否则  再也不能读取
	}
}
