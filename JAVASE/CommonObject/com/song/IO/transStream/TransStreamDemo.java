package com.song.IO.transStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//将字节流转换成字符流
//InputStreamReader  将字节转成字符 
public class TransStreamDemo {
	public static void main(String[] args) throws IOException {
		demo_2();
	}

	public static void demo_2() throws IOException {
		InputStream in=System.in;
		
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader bfr=new BufferedReader(isr);
		
		OutputStream os=System.out;
		
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		BufferedWriter bw=new BufferedWriter(osw);
		String s=null;
		while((s=bfr.readLine())!=null){
			if(s.equals("over"))
				break;
			bw.write(s.toUpperCase()+"\r\n");
			bw.flush();
		}
	}

	public static void demo_1() throws IOException {
		InputStream in=System.in;
		//注意：字符与字节的区别  
		/*  字节每次读一个字节 例如：一个中文字  需要读两次
		 *  字符每次读中文时读两个字节   
		 * */
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		String s=null;
		while((s=br.readLine())!=null){
			if(s.equals("over"))
				break;
			System.out.println(s.toUpperCase());
		}
	}
}
